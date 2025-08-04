import java.util.*;
/* BirdValueTester.java

 * This file simulates multiple games of Wingspan to evaluate how effective a specific bird card is
 * when played at different rounds and turns in the game. It basically calculates the value for each bird at a specific round/turn
 * This is used for only testing.
 * 
 */
public class BirdValueTester {

    public static void main(String[] args) {
        Bird targetBird = BirdsDeck.getBirdByName("Juniper Titmouse");
        if (targetBird == null) {
            System.out.println("Target bird not found!");
            return;
        }

        int totalGames = 1000;
        int[] turnsPerRound = {8, 7, 6, 5};

        List<String> results = new ArrayList<>();

        for (int round = 1; round <= 4; round++) {
            StringBuilder roundResult = new StringBuilder();
            roundResult.append("=== Round ").append(round).append(" ===\n");

            for (int turn = 1; turn <= turnsPerRound[round - 1]; turn++) {
                int totalScore = 0;

                for (int game = 0; game < totalGames; game++) {
                    List<Bird> deck = BirdsDeck.createDeck();
                    Collections.shuffle(deck);

                    List<Bird> faceUpCards = new ArrayList<>();
                    for (int i = 0; i < 3 && !deck.isEmpty(); i++) {
                        faceUpCards.add(deck.remove(0));
                    }

                    Map<String, BirdValueData.BirdTurnValue[][]> birdValues = BirdValueData.getMap();
                    Player player = new Player(false, birdValues);
                    player.initialDrawAI(deck);

                    // Add test bird to hand
                    Bird testBird = new Bird(targetBird); 
                    player.hand.add(0, testBird);
                    Bird handBird = player.hand.get(0);   
                    player.setForbiddenBird(handBird);    // prevent early play
                    boolean played = false;

                    for (int r = 1; r <= 4; r++) {
                        GameRounds.setRound(r);
                        for (int t = 1; t <= turnsPerRound[r - 1]; t++) {
                            GameRounds.setTurn(t);

                            if (r == round && t == turn && !played) {
                                player.clearForbiddenBirds();     
                                player.forcePlayBird(handBird, deck);
                                played = true;
                            } else {
                                player.takeTurn(deck, faceUpCards);
                            }
                        }
                    }

                    totalScore += player.getTotalScore();
                }

                double avgGameScore = totalScore / (double) totalGames;
                roundResult.append(String.format("Turn %d - Avg Score = %.2f\n", turn, avgGameScore));
            }

            results.add(roundResult.toString());
        }

        System.out.println(String.join("\n", results));
    }
}
