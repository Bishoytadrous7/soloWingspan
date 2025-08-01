/*
 * Main.java
 * Entry point for running the simplified Wingspan game.
 * Supports 3 modes:
 * "ai": runs 1 AI game
 * "human": runs 1 human game
 *  "sim": runs 1000 AI simulations
 */



import java.util.*;

public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Usage: java Main [human | ai | sim]");
            return;
        }

        String mode = args[0].toLowerCase();

        switch (mode) {
            case "human":
                runSingleGame(true);
                break;
            case "ai":
                runSingleGame(false);
                break;
            case "sim":
                simulateGames(1000);
                break;
            default:
                System.out.println("Invalid mode. Use: human, ai, or sim");
        }
    }

    public static void runSingleGame(boolean isHuman) {
        Map<String, BirdValueData.BirdTurnValue[][]> birdValues = BirdValueData.getMap();
        List<Bird> fullDeck = BirdsDeck.createDeck();

        // Fixed face-up card
        Bird fixedFirstCard = fullDeck.remove(0);
        Collections.shuffle(fullDeck);

        List<Bird> faceUpCards = new ArrayList<>();
        faceUpCards.add(fixedFirstCard);
        for (int i = 0; i < 2 && !fullDeck.isEmpty(); i++) {
            faceUpCards.add(fullDeck.remove(0));
        }

        Player player = new Player(isHuman, birdValues);
        player.initialDrawAI(fullDeck);

        int[] turnsPerRound = {8, 7, 6, 5};

        for (int round = 0; round < 4; round++) {
            GameRounds.setRound(round + 1);
            System.out.println("Round " + (round + 1));

            for (int turn = 1; turn <= turnsPerRound[round]; turn++) {
                GameRounds.setTurn(turn);
                System.out.println("\nTurn " + turn);
                if (isHuman) {
                    player.takeTurnHuman(fullDeck, faceUpCards);
                } else {
                    player.takeTurn(fullDeck, faceUpCards);
                }
            }

            System.out.println("\nEnd of Round " + (round + 1));
            player.printRoundSummary();
        }

        player.printFinalScore();
    }

    public static void simulateGames(int numGames) {
        Map<String, BirdValueData.BirdTurnValue[][]> birdValues = BirdValueData.getMap();

        int totalScore = 0;
        int maxScore = Integer.MIN_VALUE;
        int minScore = Integer.MAX_VALUE;

        int totalEggPoints = 0;
        int totalFoodCachePoints = 0;
        int totalTuckedPoints = 0;
        int totalBirdPoints = 0;

        for (int game = 1; game <= numGames; game++) {
            List<Bird> fullDeck = BirdsDeck.createDeck();

            Bird fixedFirstCard = fullDeck.remove(0);
            Collections.shuffle(fullDeck);

            List<Bird> faceUpCards = new ArrayList<>();
            faceUpCards.add(fixedFirstCard);
            for (int i = 0; i < 2 && !fullDeck.isEmpty(); i++) {
                faceUpCards.add(fullDeck.remove(0));
            }

            Player player = new Player(false, birdValues);
            player.initialDrawAI(fullDeck);

            int[] turnsPerRound = {8, 7, 6, 5};

            for (int round = 0; round < 4; round++) {
                GameRounds.setRound(round + 1);
                for (int turn = 1; turn <= turnsPerRound[round]; turn++) {
                    GameRounds.setTurn(turn);
                    player.takeTurn(fullDeck, faceUpCards);
                }
            }

            int score = player.getTotalScore();
            totalScore += score;
            maxScore = Math.max(maxScore, score);
            minScore = Math.min(minScore, score);

            totalEggPoints += player.getTotalEggs();
            totalFoodCachePoints += player.getTotalCachedFood();
            totalTuckedPoints += player.getTotalTuckedCards();
            totalBirdPoints += player.getTotalBirdPoints();
        }

        System.out.println("\n=== AI SIMULATION STATS ===");
        System.out.println("Games played: " + numGames);
        System.out.println("Average score: " + (totalScore / (double) numGames));
        System.out.println("Max score: " + maxScore);
        System.out.println("Min score: " + minScore);

        System.out.println("\n--- Breakdown ---");
        System.out.println("Egg points: " + totalEggPoints);
        System.out.println("Food cache points: " + totalFoodCachePoints);
        System.out.println("Tucked card points: " + totalTuckedPoints);
        System.out.println("Bird card points: " + totalBirdPoints);
    }
}
