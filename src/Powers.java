import java.util.*;

/*
 * Powers.java
 * Defines bird powers in the simplified Wingspan game.
 * Each bird may have a special ability that activates either when it is played (onPlay) 
 * or when the player activates the bird's habitat (onActivate).
 * Powers can behave differently for AI and human players.
 */

public interface Powers {
    void onPlay(List<Bird> deck, Player player, Bird self);
    void onActivate(List<Bird> deck, Player player, Bird self);
}

class NoPower implements Powers {
    
    public void onPlay(List<Bird> deck, Player player, Bird self) {}
    public void onActivate(List<Bird> deck, Player player, Bird self) {}
}

class LayEggPower implements Powers {
    public void onPlay(List<Bird> deck, Player player, Bird self) {}
    public void onActivate(List<Bird> deck, Player player, Bird self) {
        if (self.canLayEgg()) {
            self.layEgg();
            System.out.println(" Laid 1 egg on " + self.getName());
        } else {
            System.out.println(" Cannot lay more eggs on " + self.getName());
        }
    }
}
// Allows the player to draw a bird card from the deck.
class DrawCardPower implements Powers {
    public void onPlay(List<Bird> deck, Player player, Bird self) {
        Bird drawn = deck.remove(0);
        player.hand.add(drawn);
        System.out.println(" Drew card: " + drawn.getName() + " (Pts: " + drawn.getPoints() + ", Food: " + drawn.getFoodCost() + 
    ", Eggs: " + drawn.getEggLimit() + ", Power: " + drawn.getPower().getClass().getSimpleName() + ")");
    }

    public void onActivate(List<Bird> deck, Player player, Bird self) {
        onPlay(deck, player, self);
    }
}


// Allows the player to tuck a card from their hand under this bird, then draw a new card.
class TuckThenDrawPower implements Powers {
    public void onPlay(List<Bird> deck, Player player, Bird self) {}

    public void onActivate(List<Bird> deck, Player player, Bird self) {
        // If the player has no cards in hand, can't tuck
        if (player.hand.isEmpty()) {
            System.out.println(" No cards in hand to tuck for " + self.getName());
            return;
        }

        Bird toTuck = null;

        if (player.isHuman()) {
            // Ask the player which card they want to tuck
            System.out.println("Choose a card to tuck under " + self.getName() + ":");
            for (int i = 0; i < player.hand.size(); i++) {
                Bird b = player.hand.get(i);
                System.out.println(i + ": " + b.getName());
            }

            try {
                @SuppressWarnings("resource")
                Scanner scanner = new Scanner(System.in);
                int choice = scanner.nextInt();
                if (choice >= 0 && choice < player.hand.size()) {
                    toTuck = player.hand.get(choice);
                } else {
                    System.out.println(" Invalid choice.");
                }
            } catch (Exception e) {
                System.out.println(" Invalid input.");
            }

        } else {
            toTuck = player.hand.get(0);
            for (Bird b : player.hand) {
                if (b.getFoodCost() > toTuck.getFoodCost()) {
                    toTuck = b;
                }
            }
            System.out.println(" AI tucks card: " + toTuck.getName());
        }

        // If a card was chosen 
        if (toTuck != null) {
            player.hand.remove(toTuck);  // remove it from hand
            self.tuckCard();             // increase tucked card count
            System.out.println(" Tucked card under " + self.getName() + ": " + toTuck.getName());

            // Then draw a new card 
            Bird drawn = deck.remove(0);
            player.hand.add(drawn);
            System.out.println(" Drew card: " + drawn.getName() + " (Pts: " + drawn.getPoints() +", Food: " + drawn.getFoodCost() +
            ", Eggs: " + drawn.getEggLimit() +", Power: " + drawn.getPowerName() + ")");
        }
    }
}

// Discard 1 egg from any bird to gain food tokens
class DiscardEggForFoodPower implements Powers {
    // How much food the player gets if they discard an egg
    private final int foodGained;


    public DiscardEggForFoodPower(int foodGained) {
        this.foodGained = foodGained;
    }

    public void onPlay(List<Bird> deck, Player player, Bird self) {}

   public void onActivate(List<Bird> deck, Player player, Bird self) {
    // Skips the power if it has at least one food or it's round 3 or later.
    if (!player.isHuman() && player.food.size() >= 1 || GameRounds.getRound() >= 3) {
        System.out.println(" Skipping power (AI already has enough food).");
        return;
    }

    // Try to discard an egg from any bird
    else if (player.removeEggFromAnyBird()) {
        // If successful, add the food
        for (int i = 0; i < foodGained; i++) {
            player.food.add("food");
        }
        System.out.println(" Discarded egg for " + foodGained + " food.");
    } else {
        // No egg was available to discard
        System.out.println(" No eggs to discard for food.");
    }
}
}
// On-Play power that gives the player food when this bird is played
class GainFoodOnPlayPower implements Powers {
    private final int amount; // The number of food tokens to give

    public GainFoodOnPlayPower(int amount) {
        this.amount = amount;
    }

    public void onPlay(List<Bird> deck, Player player, Bird self) {
        // Add the specified amount of food to the player's food tokens
        for (int i = 0; i < amount; i++) player.food.add("food");
        System.out.println(" Gained " + amount + " food on play.");
    }

    public void onActivate(List<Bird> deck, Player player, Bird self) {}
}
// A power that tucks short birds under this bird when activated
class TuckShortBirdPower implements Powers {
    private final int maxLength; // Maximum size (in cm) for a bird to be tucked

   
    public TuckShortBirdPower(int maxLength) {
        this.maxLength = maxLength;
    }

    public void onPlay(List<Bird> deck, Player player, Bird self) {}

    public void onActivate(List<Bird> deck, Player player, Bird self) {
        // Draw the top card
        Bird drawn = deck.remove(0);
        // Check if its size is small enough to tuck
        if (drawn.getSizeCm() < maxLength) {
            self.tuckCard(); // Increase tucked card count
            System.out.println(" Tucked " + drawn.getName() + " (Size: " + drawn.getSizeCm() + "cm) under " + self.getName());
        }       
        else {
            System.out.println( drawn.getName() + " was too big (" + drawn.getSizeCm() + "cm), not tucked.");
        }
    }
}

// Allows bird move to another habitat only if it is the rightmost bird in its current habitat.
class MoveIfRightmostPower implements Powers {

    public void onPlay(List<Bird> deck, Player player, Bird self) {}

    public void onActivate(List<Bird> deck, Player player, Bird self) {
        // Find the habitat this bird is currently in
        String current = player.getBirdHabitat(self);
        // If the bird is not placed or not at the end of the row, do nothing
        if (current == null || !player.isRightmost(current, self)) {
            System.out.println(" Not rightmost bird in " + current);
            return;
        }
        // Human
        if (player.isHuman()) {
            @SuppressWarnings("resource")
            Scanner scanner = new Scanner(System.in);
            System.out.println("Choose a habitat to move to (forest, grassland, wetland):");
            String input = scanner.nextLine().trim();
            if (!input.equals(current) && player.playedBirds.containsKey(input)) //not choosing the same habitat
             {
                player.moveBirdToHabitat(self, current, input);
                System.out.println("  Moved " + self.getName() + " to " + input);
            } else {
                System.out.println("  Invalid or same habitat.");
            }
        }      
else {
    String best = null;
    int currentCount = player.playedBirds.get(current).size();

    for (String h : List.of("forest", "grassland", "wetland")) {
        if (h.equals(current)) continue;

        int targetCount = player.playedBirds.get(h).size();

        if (currentCount - targetCount >= 1) {
            int futureTarget = targetCount + 1;

            int forest = player.playedBirds.get("forest").size();
            int grassland = player.playedBirds.get("grassland").size();
            int wetland = player.playedBirds.get("wetland").size();

            // Simulate the move to see if it makes two habitats have 2 birds and one has 1
            if ((h.equals("forest") && futureTarget == 2 && grassland == 1 && wetland == 1) ||
                (h.equals("grassland") && futureTarget == 2 && forest == 1 && wetland == 1) ||
                (h.equals("wetland") && futureTarget == 2 && forest == 1 && grassland == 1)) {
                continue;
            }

            best = h;
            break;
        }
    }
    if (best != null) {
        player.moveBirdToHabitat(self, current, best);
        System.out.println(" AI moved " + self.getName() + " to " + best);
    } else {
        System.out.println(" AI did not move " + self.getName());
    }
}
    }
}
// Allows to draw one card, then discard one
class DrawThenDiscardPower implements Powers {
    private final int drawCount; // How many cards to draw when activated

    public DrawThenDiscardPower() {
        this(1);
    }

    public DrawThenDiscardPower(int drawCount) {
        this.drawCount = drawCount;
    }

    public void onPlay(List<Bird> deck, Player player, Bird self) {}

    public void onActivate(List<Bird> deck, Player player, Bird self) {
         //If hand is empty, there's nothing to discard
        if (player.hand.isEmpty()) {
            System.out.println("  No cards to discard.");
            return;
        }
        //Draw a card
        for (int i = 0; i < drawCount && !deck.isEmpty(); i++) {
            Bird drawn = deck.remove(0);
            player.hand.add(drawn);
            System.out.println(" Drew card: " + drawn.getName());
        }
       
        // Choose which card to discard
        Bird toDiscard;
        if (player.isHuman()) {
            System.out.println("Choose a card to discard:");
            for (int i = 0; i < player.hand.size(); i++) {
                System.out.println(i + ": " + player.hand.get(i).getName());
            }
            try {
                @SuppressWarnings("resource")
                Scanner scanner = new Scanner(System.in);
                int index = scanner.nextInt();
                if (index >= 0 && index < player.hand.size()) {
                    toDiscard = player.hand.remove(index);
                } else {
                    System.out.println("  Invalid selection.");
                    return;
                }
            } catch (Exception e) {
                System.out.println("  Invalid input.");
                return;
            }
        } else {
            //AI
            toDiscard = player.hand.get(0);

            // Find the bird with the highest food cost
            for (Bird b : player.hand) {
                if (b.getFoodCost() > toDiscard.getFoodCost()) {
                    toDiscard = b; 
                }
            }

            player.hand.remove(toDiscard);  // Remove chosen card
            System.out.println(" AI discarded " + toDiscard.getName());
        }
            System.out.println(" Discarded card: " + toDiscard.getName());
            }
        }

// Discard food tokens to tuck cards
class DiscardFoodToTuckPower implements Powers {
    private final int tuckCount;
  
    public DiscardFoodToTuckPower(int tuckCount) {
        this.tuckCount = tuckCount;
    }

    public void onPlay(List<Bird> deck, Player player, Bird self) {}

    public void onActivate(List<Bird> deck, Player player, Bird self) {
        if (player.isHuman()) {
            if (!player.food.isEmpty()) {
                player.food.remove(0);
                for (int i = 0; i < tuckCount; i++) self.tuckCard();
                System.out.println(" Discarded food to tuck " + tuckCount);
            } else {
                System.out.println(" No food to discard.");
            }
        } 
        //Ai
        else {
    boolean isLateGame = GameRounds.getRound() == 4;
    //Only discard if food > 1, or it's late game and food == 1
    if (player.food.size() > 1 || (isLateGame && player.food.size() == 1)) {
        player.food.remove(0);
        for (int i = 0; i < tuckCount; i++) self.tuckCard();
        System.out.println(" AI discarded food to tuck " + tuckCount);
    } else {
        System.out.println(" AI skipped discard due to low food.");
    }
}
}
}


class DrawCardOnPlayPower implements Powers {
    private final int drawCount;
   

    public DrawCardOnPlayPower(int drawCount) {
        this.drawCount = drawCount;
    }

    public void onPlay(List<Bird> deck, Player player, Bird self) {
        for (int i = 0; i < drawCount && !deck.isEmpty(); i++) {
            Bird drawn = deck.remove(0);
            player.hand.add(drawn);
            System.out.println(" Drew card on play: " + drawn.getName() + " (Pts: " + drawn.getPoints() + ", Food: " + drawn.getFoodCost() + 
    ", Eggs: " + drawn.getEggLimit() + ", Power: " + drawn.getPower().getClass().getSimpleName() + ")");

        }
    }

    public void onActivate(List<Bird> deck, Player player, Bird self) {}
}

class GainFoodPower implements Powers {
 
    public void onPlay(List<Bird> deck, Player player, Bird self) {
        player.food.add("food");
        System.out.println(" Gained 1 food from supply.");
    }

    public void onActivate(List<Bird> deck, Player player, Bird self) {
        onPlay(deck, player, self);
    }
}
class TuckAndLayEggPower implements Powers {
   
    public void onPlay(List<Bird> deck, Player player, Bird self) { }

    public void onActivate(List<Bird> deck, Player player, Bird self) {

        if (!self.canLayEgg()) {
            System.out.println( self.getName() + " is full of eggs; skipping tuck.");
            return;
        }

        Bird toTuck = null; 

        if (player.isHuman()) {

            System.out.println("Choose a card to tuck under " + self.getName() + ":");
            for (int i = 0; i < player.hand.size(); i++) {
                System.out.println(i + ": " + player.hand.get(i).getName());
            }
            try (Scanner sc = new Scanner(System.in)) {
                int idx = sc.nextInt();
                if (idx < 0 || idx >= player.hand.size()) {
                    System.out.println("  Invalid selection.");
                    return;
                }
                toTuck = player.hand.remove(idx);
            } catch (Exception e) {
                System.out.println("  Invalid input.");
                return;
            }
        } else {
            if (player.hand.size() < 2) {
                
                if (GameRounds.getRound() == 4 && GameRounds.getTurn() >= 1 && !player.hand.isEmpty()) {
                 toTuck = player.hand.remove(0);
                    self.tuckCard();
                    System.out.println("  Tucked " + toTuck.getName() + " under " + self.getName());

                    self.layEgg();
                    System.out.println("  Laid 1 egg on " + self.getName());
                    return;
                }


                System.out.println("  Not enough cards to use " + self.getName() + "'s tuck and egg power.");
                return;
            }

            
       // AI: pick the card in hand that costs the most food
        toTuck = player.hand.get(0);
        for (Bird b : player.hand) {
            if (b.getFoodCost() > toTuck.getFoodCost()) {
                toTuck = b;
            }
        }
        player.hand.remove(toTuck);
        System.out.println(" AI tucked " + toTuck.getName());
        }

        self.tuckCard();
        System.out.println("  Tucked card under " + self.getName());

        self.layEgg();
        System.out.println("  Laid 1 egg on " + self.getName());
    }
}


class LayEggOnSelfPower implements Powers {
   
    public void onPlay(List<Bird> deck, Player player, Bird self) {
        if (self.canLayEgg()) {
            self.layEgg();
            System.out.println(" Laid 1 egg on itself: " + self.getName());
        } else {
            System.out.println(" Cannot lay more eggs on " + self.getName());
        }
    }

    public void onActivate(List<Bird> deck, Player player, Bird self) {
        onPlay(deck, player, self);
    }
}

class CacheFoodFromSupplyPower implements Powers {
   
    public void onPlay(List<Bird> deck, Player player, Bird self) {
        player.food.add("food");
        self.cacheFood();
        System.out.println(" Cached 1 food from supply on " + self.getName());
    }

    public void onActivate(List<Bird> deck, Player player, Bird self) {
        onPlay(deck, player, self);
    }
}
class TuckGainFoodPower implements Powers {

    public void onPlay(List<Bird> deck, Player player, Bird self) {}

    public void onActivate(List<Bird> deck, Player player, Bird self) {
        if (player.hand.isEmpty()) {
            System.out.println(" No cards in hand to tuck for " + self.getName());
            return;
        }

        Bird toTuck = null;

        if (player.isHuman()) {
            System.out.println("Choose a card to tuck under " + self.getName() + ":");
            for (int i = 0; i < player.hand.size(); i++) {
                System.out.println(i + ": " + player.hand.get(i).getName());
            }

            try {
                @SuppressWarnings("resource")
                Scanner scanner = new Scanner(System.in);
                int index = scanner.nextInt();

                if (index >= 0 && index < player.hand.size()) {
                    toTuck = player.hand.remove(index);
                } else {
                    System.out.println(" Invalid selection.");
                    return;
                }
            } catch (Exception e) {
                System.out.println(" Invalid input.");
                return;
            }

        } else {
            toTuck = player.hand.get(0);
            for (Bird b : player.hand) {
                if (b.getPoints() < toTuck.getPoints()) {
                    toTuck = b;
                }
            }
            player.hand.remove(toTuck);
            System.out.println(" AI tucked card: " + toTuck.getName());
        }

        self.tuckCard();
        player.food.add("food");
        System.out.println(" Tucked a card under " + self.getName() + " and gained 1 food.");
    }
}

class PlaySecondBirdPower implements Powers {
   // Storing the valid habitats where the second bird can be played
    private final String[] habitats;

    public PlaySecondBirdPower(String... habitats) {
        this.habitats = habitats;
    }

    public void onPlay(List<Bird> deck, Player player, Bird self) {}

    public void onActivate(List<Bird> deck, Player player, Bird self) {
        System.out.println(" You may play a second bird in: " + String.join(", ", habitats));

        for (Bird b : new ArrayList<>(player.hand)) {
            for (String habitat : habitats) {
                if (player.getPlayableHabitat(b).equals(habitat)) {
                    int foodCost = b.getFoodCost();
                    int eggCost = player.playedBirds.get(habitat).size();
                    if (player.food.size() >= foodCost && player.getTotalEggs() >= eggCost) {
                        for (int i = 0; i < foodCost; i++) player.food.remove(0);
                        for (int i = 0; i < eggCost; i++) player.removeEggFromAnyBird();
                        player.hand.remove(b);
                        player.playedBirds.get(habitat).add(b);
                        System.out.println(" Second bird played: " + b.getName() + " in " + habitat);
                        if (b.getPowerType() == Bird.PowerType.ON_PLAY) {
                            b.getPower().onPlay(deck, player, b);
                        }
                        return;
                    }
                }
            }
        }
    }

}

class DiscardEggDrawCardsPower implements Powers {
    private final int drawCount;

    public DiscardEggDrawCardsPower(int drawCount) {
        this.drawCount = drawCount;
    }

    public void onPlay(List<Bird> deck, Player player, Bird self) {}

    public void onActivate(List<Bird> deck, Player player, Bird self) {
        if (player.isHuman()) {
            if (player.removeEggFromAnyBird()) {
                System.out.println(" Discarded 1 egg.");
                for (int i = 0; i < drawCount && !deck.isEmpty(); i++) {
                    Bird drawn = deck.remove(0);
                    player.hand.add(drawn);
                     System.out.println(" Drew card: " + drawn.getName() + " (Pts: " + drawn.getPoints() + ", Food: " + drawn.getFoodCost() + 
    ", Eggs: " + drawn.getEggLimit() + ", Power: " + drawn.getPowerName() + ")");
                }
            } else {
                System.out.println(" No egg to discard.");
            }
        } else {
    // Only discard egg for card draw if hand is empty
    if (player.hand.isEmpty()) {
        if (player.getTotalEggs() > 1 && player.removeEggFromAnyBird()) {
            System.out.println(" AI discarded 1 egg.");
            for (int i = 0; i < drawCount && !deck.isEmpty(); i++) {
                Bird drawn = deck.remove(0);
                player.hand.add(drawn);
                System.out.println(" AI drew card: " + drawn.getName() + " (Pts: " + drawn.getPoints() + ", Food: " + 
                drawn.getFoodCost() + ", Eggs: " + drawn.getEggLimit() + ", Power: " + drawn.getPowerName()+ ")");
            }
        } else {
            System.out.println(" AI skipped egg discard due to low egg count.");
        }
    } else {
        System.out.println(" AI skipped egg discard power");
    }
}
}
}

class GainThenMaybeCachePower implements Powers {

    public void onPlay(List<Bird> deck, Player player, Bird self) {}

    public void onActivate(List<Bird> deck, Player player, Bird self) {
        player.food.add("food");
        System.out.println(" Gained 1 food token.");

        if (player.isHuman()) {
            @SuppressWarnings("resource")
            Scanner scanner = new Scanner(System.in);
            System.out.println("Do you want to cache 1 food from your supply on " + self.getName() + "? (1 = yes, 0 = no)");
            int choice = scanner.nextInt();
            if (choice == 1 && !player.food.isEmpty()) {
                player.food.remove(player.food.size() - 1);
                self.cacheFood();
                System.out.println(" Cached 1 food on " + self.getName());
            } else {
                System.out.println(" Did not cache food.");
            }
        } else {
        if ((GameRounds.getRound() == 4 ||  player.food.size() >= 1)) {
            player.food.remove(player.food.size() - 1);
            self.cacheFood();
            System.out.println("AI cached 1 food on " + self.getName());
        } else {
            System.out.println(" AI skipped caching food on " + self.getName());
        }
    }
}
}


