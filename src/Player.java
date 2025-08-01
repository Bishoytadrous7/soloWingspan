import java.util.*;

/*
 * Player.java
 * Represents a player in the simplified Wingspan game.
 * A player can be either human or AI and keeps track of their hand, food,
 * played birds (organized by habitat), and actions taken during the game.
 * This class handles playing birds, managing resources like eggs and food, and activating bird powers.
 */

public class Player {

    // Enum to remember the last action taken during a turn (used for activating powers)
    public enum LastAction {
        NONE, PLAY, DRAW, LAY_EGGS, GAIN_FOOD
    }
    private boolean isHuman; // Whether the player is human or AI

    // Game Basics
    public List<String> food = new ArrayList<>();
    public List<Bird> hand = new ArrayList<>();
    public Map<String, List<Bird>> playedBirds = new HashMap<>(); // Birds placed on the board by habitat

    // This is used for tracking which birds were played in this turn
    private Set<Bird> birdsPlayedThisTurn = new HashSet<>();

    private List<Bird> faceUpCards;
    private Map<String, BirdValueData.BirdTurnValue[][]> birdValues;
    public LastAction lastAction = LastAction.NONE;
    Random random = new Random();

    // A constructor for players without bird value data (human version)
    public Player(boolean isHuman) {
        this(isHuman, null);
    }

    public Player(boolean isHuman, Map<String, BirdValueData.BirdTurnValue[][]> birdValues) {
        this.isHuman = isHuman;
        this.birdValues = birdValues;

        // Initialize played birds for each habitat
        playedBirds.put("forest", new ArrayList<>());
        playedBirds.put("grassland", new ArrayList<>());
        playedBirds.put("wetland", new ArrayList<>());
    }

    public void setFaceUpCards(List<Bird> faceUpCards) {
        this.faceUpCards = faceUpCards;
    }

    public Map<String, BirdValueData.BirdTurnValue[][]> getBirdValues() {
        return birdValues;
    }

    public List<Bird> getFaceUpCards() {
        return faceUpCards;
    }

    public boolean isHuman() {
        return isHuman;
    }
// Called if the player is human; gives action menu and handles input
@SuppressWarnings("resource")
public void takeTurnHuman(List<Bird> deck, List<Bird> faceUpCards){
    Scanner input = new Scanner(System.in);

    while (true) {
        showPlayerBoard();

        System.out.println("\nYour Turn!");
        System.out.println("Choose an action:");
        System.out.println("1. Play a bird");
        System.out.println("2. Lay eggs");
        System.out.println("3. Gain food");
        System.out.println("4. Draw card");

        int choice = input.nextInt();

        // Option 1: Play a bird 
        if (choice == 1) {
            if (hand.isEmpty()) {
                System.out.println("No birds in hand.");
                continue;
            }
        // Show all birds in hand with their power and habitats possible.
            System.out.println("Your hand (powers listed):");
            for (int i = 0; i < hand.size(); i++) {
                Bird b = hand.get(i);
                String powerName;
            if (b.getPowerType() == Bird.PowerType.NONE) {
                powerName = "None";
            } else {
                powerName = b.getPower().getClass().getSimpleName();
            }
            String habitats = "";
            if (b.isHabitatForest()) habitats += "forest ";
            if (b.isHabitatGrassland()) habitats += "grassland ";
            if (b.isHabitatWetland()) habitats += "wetland ";
            System.out.println(i + ": " + b.getName() + " - Power: " + powerName + " | Food: " + b.getFoodCost() + " | Habitats: " + habitats.trim());
            }
            // Ask which bird to play
            System.out.println("Choose bird to play:");
            int birdIndex = input.nextInt();

            if (birdIndex < 0 || birdIndex >= hand.size()) {
                System.out.println("Invalid index.");
                continue;
            }

            Bird chosen = hand.get(birdIndex);
            // Collect possible habitats for this bird
            List<String> possibleHabitats = new ArrayList<>();
            if (chosen.isHabitatForest()) possibleHabitats.add("forest");
            if (chosen.isHabitatGrassland()) possibleHabitats.add("grassland");
            if (chosen.isHabitatWetland()) possibleHabitats.add("wetland");
            // If only one habitat is available, it will just be played in this habitat
            String habitat;
            if (possibleHabitats.size() == 1) {
                habitat = possibleHabitats.get(0);
            } 
            // if more than one habitat is available, it asks which one you would like to play it in.
            else {
                System.out.println("Choose a habitat to play " + chosen.getName() + ":");
                for (int i = 0; i < possibleHabitats.size(); i++) {
                    System.out.println(i + ": " + possibleHabitats.get(i));
                }
                int habitatChoice = input.nextInt();
                if (habitatChoice < 0 || habitatChoice >= possibleHabitats.size()) {
                    System.out.println("Invalid habitat choice.");
                    continue;
                }
                habitat = possibleHabitats.get(habitatChoice);
            }

            // Cost to play in that habitat (based on slot number)
            int cost = playedBirds.get(habitat).size();

            // Check if the player has enough food
            if (food.size() < chosen.getFoodCost()) {
                System.out.println("Not enough food. You need " + chosen.getFoodCost());
                continue;
            }
            // Check if the player has enough eggs
            if (getTotalEggs() < cost) {
                System.out.println(" Not enough eggs to play in slot " + (cost + 1));
                continue;
            }
            // Pay food and eggs
            for (int i = 0; i < chosen.getFoodCost(); i++) food.remove(0);
            for (int i = 0; i < cost; i++) removeEggFromAnyBird();

            // Move bird from hand to board
            hand.remove(chosen);
            playedBirds.get(habitat).add(chosen);
            System.out.println(" Played " + chosen.getName() + " in " + habitat);

            // Trigger on-play power, if there's any
            if (chosen.getPowerType() == Bird.PowerType.ON_PLAY) {
                chosen.getPower().onPlay(deck, this, chosen);
            }
             // Tracking the last action 
            lastAction = LastAction.PLAY; 
            break;
        }

        // Option 2: Lay Eggs
        else if (choice == 2) {
            // all birds that can still hold more eggs
            List<Bird> allBirds = new ArrayList<>();
            for (List<Bird> row : playedBirds.values()) {
                for (Bird b : row) {
                    if (b.canLayEgg()) allBirds.add(b);
                }
            }
            // If no bird can hold more eggs
            if (allBirds.isEmpty()) {
                System.out.println("No birds can receive more eggs.");
                continue;
            }
            // Number of eggs to lay depends on grassland row size
            int grassCount = playedBirds.get("grassland").size();
            int eggsToLay = switch (grassCount) {
                case 0, 1 -> 2;
                case 2, 3 -> 3;
                case 4, 5 -> 4;
                default -> 2;
            };
            // Let player choose where to lay their eggs, one egg at a time
            int laid = 0;
            while (laid < eggsToLay && !allBirds.isEmpty()) {
                System.out.println("Choose bird to lay egg on (" + (eggsToLay - laid) + " remaining):");
                for (int i = 0; i < allBirds.size(); i++) {
                    Bird b = allBirds.get(i);
                    System.out.println(i + ": " + b.getName() + " (" + b.getEggs() + "/" + b.getEggLimit() + ")");
                }
                int pick = input.nextInt();
                if (pick >= 0 && pick < allBirds.size()) {
                    Bird b = allBirds.get(pick);
                    b.layEgg();
                    laid++;
                    System.out.println(" Laid 1 egg on " + b.getName());
                    if (!b.canLayEgg()) allBirds.remove(pick);
                } else {
                    System.out.println("Invalid choice.");
                }
            }
            lastAction = LastAction.LAY_EGGS;
            break;
        }
        // Option 3: Gain Food 
        else if (choice == 3) {
            int forestCount = playedBirds.get("forest").size();
            int gain = switch (forestCount) {
                case 0, 1 -> 1;
                case 2, 3 -> 2;
                case 4, 5-> 3;
                default -> 1;
            };
            for (int i = 0; i < gain; i++) food.add("food");
            System.out.println(" Gained " + gain + " food.");
            lastAction = LastAction.GAIN_FOOD;
            break;
        }
        // Option 4: Draw Card
        else if (choice == 4) {
            int wetCount = playedBirds.get("wetland").size();
            int cards = switch (wetCount) {
                case 0, 1 -> 1;
                case 2, 3 -> 2;
                case 4, 5-> 3;
                default -> 1;
            };
            for (int i = 0; i < cards; i++) drawCard(deck, faceUpCards);
;
            lastAction = LastAction.DRAW;
            break;
        }

        else {
            System.out.println("Invalid action number.");
        }
    }
    // After taking an action, activate all bird powers available
    activateBirdPowers(deck);

}

// AI Setup (2 cards - 3 food)
public void initialDrawAI(List<Bird> deck) {
    for (int i = 0; i < 2; i++) {
        hand.add(deck.remove(0));
    }
    for (int i = 0; i < 3; i++){
        food.add("food");
    }
        System.out.println("Player starting hand: " + hand);
    }

    
public void takeTurn(List<Bird> deck, List<Bird> faceUpCards) {
lastAction = LastAction.NONE;

Bird toPlay = null;
int neededEggs = 0;

if (birdValues != null) {
    int round = GameRounds.getRound();
    int turn = GameRounds.getTurn();

    double bestScore = -1;
    Bird bestBird = null;
    int bestEggCost = 0;

    // Loop through hand to find the best-value playable bird
    for (Bird b : hand) {
        BirdValueData.BirdTurnValue[][] values = birdValues.get(b.getName());
        if (values != null && round < values.length && turn < values[round].length && values[round][turn] != null) {
            double score = values[round][turn].averageScore;

            String habitat = getPlayableHabitat(b);
            int cost = playedBirds.get(habitat).size();

            if (food.size() >= b.getFoodCost() && getTotalEggs() >= cost && score > bestScore) {
                bestScore = score;
                bestBird = b;
                bestEggCost = cost;
            }
        }
    }
    if (bestBird != null) {
        toPlay = bestBird;
        neededEggs = bestEggCost;
    }
}
// If we found a bird to play, pay its costs and play it
    if (toPlay != null) {
        hand.remove(toPlay); // Remove bird from hand
        for (int i = 0; i < toPlay.getFoodCost(); i++) {
            food.remove(0); //Pay Food
        }
        for (int i = 0; i < neededEggs; i++) {
            removeEggFromAnyBird(); // Pay eggs if needed
        }

        String habitat = getPlayableHabitat(toPlay); // Get where to play it
        playedBirds.get(habitat).add(toPlay); // Place it on the board
        birdsPlayedThisTurn.add(toPlay); // Track it for powers
        System.out.println("AI played " + toPlay.getName() + " in " + habitat);

        // Activate its on-play power if it has one
        if (toPlay.getPowerType() == Bird.PowerType.ON_PLAY) {
            toPlay.getPower().onPlay(deck, this, toPlay);
        }
        lastAction = LastAction.PLAY;
    } 
    // If we couldn’t play a bird, lay eggs instead (Strategy of laying eggs in round 4)
    else if (shouldLayEggsInsteadOfBeingBlocked() || layEggsLateGame()) {
        layEggs();
        lastAction = LastAction.LAY_EGGS;

    //If we still can't play, gain food or draw cards
    } else if (!hand.isEmpty()) {
        Bird bestValuedBird = null;
        double bestScore = -1;
        int round = GameRounds.getRound();
        int turn = GameRounds.getTurn();
    // Check which bird has the highest card-value
    for (Bird b : hand) {
        BirdValueData.BirdTurnValue[][] values = birdValues.get(b.getName());
        if (values != null && round < values.length && turn < values[round].length && values[round][turn] != null) {
            double score = values[round][turn].averageScore;
            if (score > bestScore) {
                bestScore = score;
                bestValuedBird = b;
            }
        }
    }
    // If best card-value bird needs more food, gain food
    if (bestValuedBird != null && food.size() < bestValuedBird.getFoodCost()) {
        int forestCount = playedBirds.get("forest").size();
        int foodToGain = switch (forestCount) {
            case 0, 1 -> 1;
            case 2, 3 -> 2;
            case 4, 5, 6 -> 3;
            default -> 1;
        };
    for (int i = 0; i < foodToGain; i++) food.add("food");
    System.out.println("AI gained " + foodToGain + " food.");
    lastAction = LastAction.GAIN_FOOD;
} else {
    // Draw cards
    int wetlandCount = playedBirds.get("wetland").size();
    int cardsToDraw = switch (wetlandCount) {
        case 0, 1 -> 1;
        case 2, 3 -> 2;
        case 4, 5, 6 -> 3;
        default -> 1;
    };
    for (int i = 0; i < cardsToDraw && !deck.isEmpty(); i++) {
        drawCard(deck, faceUpCards);
    }
    lastAction = LastAction.DRAW;
}
    // if hand is empty, draw best-card value from the faceUp cards 
    } else {
        drawCard(deck, faceUpCards);
        lastAction = LastAction.DRAW;
    }

    activateBirdPowers(deck); // Activate powers of birds in the last habitat used
}


public void activateBirdPowers(List<Bird> deck) {
    // Loop over all habitats in order
    for (String hab : List.of("forest", "grassland", "wetland")) {
       
        List<Bird> birdsCopy = new ArrayList<>(playedBirds.get(hab)); // Make a reversed copy of the birds in that habitat

        Collections.reverse(birdsCopy);  // Powers activate right-to-left

        for (Bird b : birdsCopy) {
            // Only activate birds with an brown power
            if (b.getPowerType() != Bird.PowerType.ACTIVATED) continue;
         
            boolean shouldActivate = false;

            // Check if the bird should be activated based on the habitat and last action
            if (hab.equals("forest") && lastAction == LastAction.GAIN_FOOD) {
                shouldActivate = true;
            } else if (hab.equals("grassland") && lastAction == LastAction.LAY_EGGS) {
                shouldActivate = true;
            } else if (hab.equals("wetland") && lastAction == LastAction.DRAW) {
                shouldActivate = true;
            }


            if (shouldActivate) {
                // If human, ask if whether the player want to activate the power or not
                if (isHuman) {
                    @SuppressWarnings("resource")
                    Scanner in = new Scanner(System.in);
                    System.out.println("Do you want to activate " + b.getName() + "'s power? (1 = yes, 0 = no)");
                    int choice = in.nextInt();
                    if (choice != 1) continue;
                }
                // Activate the power
                b.getPower().onActivate(deck, this, b);
                System.out.println(" Activated power of " + b.getName());
            }
        }
    }
        birdsPlayedThisTurn.clear();
        // Show current player scores
        int score = getTotalScore();
        System.out.println(" → Current score: " + score);
        System.out.println(" → Food: " + food.size());
        System.out.println(" → Hand: " + hand.size() + " cards: " + hand);
        System.out.println(" → Played birds:");
        for (String hab : playedBirds.keySet()) {
            System.out.println("   - " + hab + ":");
            for (Bird b : playedBirds.get(hab)) {
                System.out.println("     " + b.getName() + " (Pts: " + b.getPoints() + ", Eggs: " + b.getEggs() + "/" + b.getEggLimit() + ")");
            }
        }
    }
    // Laying Eggs Strategy (From Round 4, just start laying eggs)
    public boolean layEggsLateGame() {
        int round = GameRounds.getRound();
        int turn = GameRounds.getTurn();
        return (round == 4 && turn >= 1);
    }
    // Check if player has enough food but not enough eggs to play any bird
    public boolean shouldLayEggsInsteadOfBeingBlocked() {
        for (Bird b : hand) {
            String habitat = getPlayableHabitat(b);
            int cost = playedBirds.get(habitat).size();

            boolean hasEnoughFood = food.size() >= b.getFoodCost();
            boolean notEnoughEggs = getTotalEggs() < cost;

            if (hasEnoughFood && notEnoughEggs) {
                return true; // At least one bird is blocked due to eggs
            }
        }
        return false; // No birds are blocked
    }

   public void drawCard(List<Bird> deck, List<Bird> faceUpCards) {
    // Show face-up cards for human player
    if (isHuman) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        System.out.println("Available face-up cards:");
    for (int i = 0; i < faceUpCards.size(); i++) {
        Bird b = faceUpCards.get(i);
        String power = (b.getPowerType() == Bird.PowerType.NONE) ? "None" : b.getPower().getClass().getSimpleName();
        String habitats = "";
        if (b.isHabitatForest()) habitats += "forest ";
        if (b.isHabitatGrassland()) habitats += "grassland ";
        if (b.isHabitatWetland()) habitats += "wetland ";
    // Print card info
    System.out.println(i + ": " + b.getName() + 
        " | Pts: " + b.getPoints() +
        " | Food: " + b.getFoodCost() +
        " | Eggs: " + b.getEggLimit() +
        " | Power: " + power +
        " | Habitats: " + habitats.trim());
}

    System.out.println("Do you want to draw from face-up cards or blind draw? (faceup/random)");
    String choice = scanner.next().toLowerCase();

    if (choice.equals("faceup") && !faceUpCards.isEmpty()) {
        System.out.println("Choose a face-up card:");
        int pick = scanner.nextInt();
        if (pick >= 0 && pick < faceUpCards.size()) {
            Bird selected = faceUpCards.get(pick);
            hand.add(selected);
            System.out.println(" → Drew face-up card: " + selected.getName());
        // Replace card from top of deck
        if (!deck.isEmpty()) {
            faceUpCards.set(pick, deck.remove(0)); 
        } else {
            faceUpCards.set(pick, null);  
        }
            return;
            } else {
                System.out.println("Invalid pick. Drawing random card instead.");
            }
        }
    }
    
//Ai Drawing Strategy
Bird best = null;
int bestIndex = -1;
double bestAverageScore = -1;
int round = GameRounds.getRound();
int turn = GameRounds.getTurn();

  // AI picks best valued face-up card
for (int i = 0; i < faceUpCards.size(); i++) {
    Bird b = faceUpCards.get(i);
    if (b == null) continue;

    BirdValueData.BirdTurnValue[][] values = birdValues.get(b.getName());
    if (values != null && round < values.length && turn < values[round].length && values[round][turn] != null) {
        double avg = values[round][turn].averageScore;

        if (avg > bestAverageScore) {
            best = b;
            bestIndex = i;
            bestAverageScore = avg;
        }
    }
}
if (best != null) {
    hand.add(best);
    System.out.println("AI drew face-up card: " + best.getName());

    if (!deck.isEmpty()) {
        faceUpCards.set(bestIndex, deck.remove(0));
    } else {
        faceUpCards.set(bestIndex, null);
    }
} else if (!deck.isEmpty()) {
    Bird drawn = deck.remove(0);
    hand.add(drawn);
    System.out.println("AI drew blind card: " + drawn.getName());
}
}
/* * AI 2 Drawing Strategy: Picks the most expensive face-up bird (highest food cost)
Bird best = null;
int bestIndex = -1;
for (int i = 0; i < faceUpCards.size(); i++) {
    Bird b = faceUpCards.get(i);
    if (b != null && (best == null || b.getPoints() > best.getPoints())) {
        best = b;
        bestIndex = i;
    }
}
    if (best != null) {
        hand.add(best);
        System.out.println("AI drew face-up card: " + best.getName());
        if (!deck.isEmpty()) {
            Collections.shuffle(deck);
            faceUpCards.set(bestIndex, deck.remove(0));
           } else {
               faceUpCards.set(bestIndex, null);
           }
       } else if (!deck.isEmpty()) {
           Bird drawn = deck.remove(0);
           hand.add(drawn);
           System.out.println("AI drew blind card: " + drawn.getName());
       }
   }
*/

/*
 * AI 3 Drawing Strategy: Picks the cheapest face-up bird (lowest food cost)
Bird best = null;
int bestIndex = -1;
for (int i = 0; i < faceUpCards.size(); i++) {
    Bird b = faceUpCards.get(i);
    if (b != null && (best == null || b.getFoodCost() < best.getFoodCost())) {
        best = b;
        bestIndex = i;
    }
}

if (best != null) {
    hand.add(best);
    System.out.println("AI drew face-up card: " + best.getName());
    if (!deck.isEmpty()) {
        Collections.shuffle(deck);
        faceUpCards.set(bestIndex, deck.remove(0));
    } else {
        faceUpCards.set(bestIndex, null);
    }
} else if (!deck.isEmpty()) {
    Bird drawn = deck.remove(0);
    hand.add(drawn);
    System.out.println("AI drew blind card: " + drawn.getName());
}
*/


    // Removing one egg from any bird that has at least one egg
    public boolean removeEggFromAnyBird() {
        for (List<Bird> birds : playedBirds.values()) {
            for (Bird b : birds) {
                if (b.getEggs() > 0) {
                    b.setEggs(b.getEggs() - 1);
                    return true;
                }
            }
        }
        return false;
    }

    // AI lays eggs in grassland (how many eggs to pay depending on the slot)
    public void layEggs() {
        
    int grassCount = playedBirds.get("grassland").size();
    int eggsToLay = switch (grassCount) {
        case 0, 1 -> 2;
        case 2, 3 -> 3;
        case 4, 5, 6 -> 4;
        default -> 2;
    };

    List<Bird> allBirds = new ArrayList<>();
    for (List<Bird> row : playedBirds.values()) {
        for (Bird b : row) {
            if (b.canLayEgg()) allBirds.add(b);
        }
    }
    int laid = 0;
    while (laid < eggsToLay && !allBirds.isEmpty()) {
        Bird b = allBirds.remove(0);
        b.layEgg();
        laid++;
        System.out.println(" → AI laid 1 egg on " + b.getName());
        if (b.canLayEgg()) allBirds.add(b); 
    }
}
    //Choose the habitat with the fewest birds where this bird can be played
    public String getPlayableHabitat(Bird b) {
    List<String> possibleHabitats = new ArrayList<>();

    // Check which habitats this bird can live in
    if (b.isHabitatForest()) possibleHabitats.add("forest");
    if (b.isHabitatGrassland()) possibleHabitats.add("grassland");
    if (b.isHabitatWetland()) possibleHabitats.add("wetland");

    if (possibleHabitats.isEmpty()) {
        throw new IllegalArgumentException("Bird has no valid habitat.");
    }

    // Find the habitat with the least number of birds played
    String bestHabitat = possibleHabitats.get(0);
    int fewestBirds = playedBirds.get(bestHabitat).size();

    for (String h : possibleHabitats) {
        int count = playedBirds.get(h).size();
        if (count < fewestBirds) {
            fewestBirds = count;
            bestHabitat = h;
        }
    }

    return bestHabitat;
}

 // Calculate total eggs across all played birds
    public int getTotalEggs() {
        int total = 0;
        for (List<Bird> birds : playedBirds.values()) {
            for (Bird b : birds) total += b.getEggs();
        }
        return total;
    }
    // Final score = bird points + eggs + tucked cards + cached food
    public int getTotalScore() {
        int total = 0;
        for (List<Bird> birds : playedBirds.values()) {
            for (Bird b : birds) {
                total += b.getPoints() + b.getEggs() + b.getTuckedCards() + b.getCachedFood();
            }
        }
        return total;
    }

    // Find and return the habitat name where the bird is located
    public String getBirdHabitat(Bird bird) {
        if (playedBirds.get("forest").contains(bird)) return "forest";
        if (playedBirds.get("grassland").contains(bird)) return "grassland";
        if (playedBirds.get("wetland").contains(bird)) return "wetland";
        return null; // Bird not found
    }


    // Check if the bird is the last one in its habitat (needed for the power moving birds that are in the rightmost.)
    public boolean isRightmost(String habitat, Bird bird) {
    List<Bird> birdsInHabitat = playedBirds.get(habitat);

    // If no birds are in this habitat, return false
    if (birdsInHabitat.isEmpty()) {
        return false;
    }

    // Get the last bird in the list
    Bird lastBird = birdsInHabitat.get(birdsInHabitat.size() - 1);

    // Check if the given bird is the last one
    return lastBird == bird;
}

    public void moveBirdToHabitat(Bird bird, String from, String to) {
    // Try to remove the bird from the 'from' habitat list
    if (playedBirds.get(from).remove(bird)) {
        // If the bird was removed, add it to the 'to' habitat
        playedBirds.get(to).add(bird);
    }
}

    // Print out the player's current board stats
    public void showPlayerBoard() {
    System.out.println("\n---Your Board---");
    System.out.println("Food: " + food.size());
    System.out.println("Eggs: " + getTotalEggs());
    System.out.println("Cards in Hand: " + hand.size());
    
    // Show all cards in hand with their details
    System.out.println("\nYour Hand:");
    for (int i = 0; i < hand.size(); i++) {
        Bird b = hand.get(i);
        System.out.println("  " + i + ": " + b.getName() + " (Pts: " + b.getPoints() + ", Food: " + b.getFoodCost() + ", Eggs: " + 
        b.getEggLimit() + ", Power: "+ b.getPowerName()); 
}

    System.out.println("\nPlayed Birds:");
    for (String habitat : playedBirds.keySet()) {
        System.out.println("  " + habitat + ":");
        for (Bird b : playedBirds.get(habitat)) {
            System.out.println("    - " + b.getName() + " (Pts: " + b.getPoints()+ ", Eggs: " + b.getEggs() + "/" + b.getEggLimit()
            + ", Power: " + b.getPowerName());
        }
    }
}

// Return the total number of tucked cards.
public int getTotalTuckedCards() {
    int total = 0;
    for (List<Bird> birds : playedBirds.values()) {
        for (Bird b : birds) {
            total += b.getTuckedCards();
        }
    }
    return total;
}

// Return the total amount of cached food 
public int getTotalCachedFood() {
    int total = 0;
    for (List<Bird> birds : playedBirds.values()) {
        for (Bird b : birds) {
            total += b.getCachedFood();
        }
    }
    return total;
}

// Return the total bird point values from all played birds
public int getTotalBirdPoints() {
    int total = 0;
    for (List<Bird> birds : playedBirds.values()) {
        for (Bird b : birds) {
            total += b.getPoints();
        }
    }
    return total;
}

// Print a summary of the player's current score at the end of each round
public void printRoundSummary() {
    int total = getTotalEggs() + getTotalTuckedCards() + getTotalCachedFood() + getTotalBirdPoints();

    System.out.println("\n---End of Round Summary---");
    System.out.println("Bird Points:     " + getTotalBirdPoints());
    System.out.println("Eggs:            " + getTotalEggs());
    System.out.println("Tucked Cards:    " + getTotalTuckedCards());
    System.out.println("Cached Food:     " + getTotalCachedFood());
    System.out.println("Total Score:   " + total);
}

// Print the final score at the end of the game 
public void printFinalScore() {
    System.out.println("\n");
    System.out.println("Final Score");
    printRoundSummary();
    
}
}