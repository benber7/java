public class methodChallenge {
    public static void main(String[] args) {

        int highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Tim", highScorePosition);
    }   

    public static void displayHighScorePosition (String playerName, int playerPosition) {
        System.out.println(playerName + "managed to get to position " + playerPosition + " on the list");
    }

    public static int calculateHighScorePosition (int playerScore) {
        if (playerScore >= 1000) {
            return 1;
        } else if (playerScore >= 500 && playerScore < 1000) {
            return 2;
        } else if (playerScore >= 100 && playerScore < 500) {
            return 3;
        } else {
            return 4;
        }
    }
}
