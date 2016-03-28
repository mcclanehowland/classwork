public class GameManager {

    static int berryCount = 0;
    static int player1Count = 0;
    static int player2Count = 0;

    private GameManager() {

    }
    public static int getTotal() {
        return player1Count+player2Count;
    }
    public static int berriesLeft() {
        return berryCount - (player1Count + player2Count);
    }
    public static void reset() {
        berryCount = 0;
        player1Count = 0;
        player2Count = 0;
    }
}

