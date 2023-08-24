package prosjekter;
public class test {
    public static void main (String[] args) {

        int botHealth = 100;
        int playerHealth = 100;

        
        int randomNum = (int) Math.round(Math.random() * 4);

        //System.out.print(randomNum);
        //System.out.print("Choose a number between 1 and 10");


        if (randomNum == 1) {
            botHealth -= 10;
            System.out.println("Enemy health: " + botHealth);
        } else if (randomNum == 2) {
            playerHealth -= 10;
            System.out.println("Your health: " + playerHealth);
        } else {
            System.out.println("You both missed!" + "| Enemy health: " + botHealth + "| Your health: " + playerHealth);
        }
    }
}
