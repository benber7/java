public class teenNumber {
    public static void main(String[] args) {
        
    }

    public static boolean hasTeen (int myFirstValue, int mySecondValue, int myThirdValue) {
        return isTeen(myFirstValue) || isTeen(mySecondValue) || isTeen(myThirdValue);
    }

    public static boolean isTeen (int myFirstValue) {
        return (myFirstValue >= 13 && myFirstValue <= 19);
    }
}
