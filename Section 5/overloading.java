public class overloading {
    public static void main(String[] args) {
        
    }
    
    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }
    public static int calculateScore(int score) {
        return calculateScore("Anonymous", score);
    }
    public static int calculateScore() {
        System.out.println("No player name, no playeer score.");
        return 0;
    }
}
