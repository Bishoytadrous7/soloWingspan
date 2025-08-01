/*
 * GameRounds.java
 * Manages the current round and turn number in the game.
 * This class uses static variables and methods so that round and turn tracking
 * is shared and accessible across all parts of the game.
 */

public class GameRounds {
    private static int round = 1;
    private static int turn = 1;

    public static int getRound() {
        return round;
    }

    public static void setRound(int r) {
        round = r;
    }

    public static int getTurn() {
        return turn;
    }

    public static void setTurn(int t) {
        turn = t;
    }
} 
