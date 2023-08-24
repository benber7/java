public class overloadingChallenge {
    public static void main(String[] args) {
         
    }

    public static double convertToCentimeters (int heightInches) {
        return heightInches * 2.54;
    }
    public static double convertToCentimeters (int heightFeet, int heightInches) {
        return convertToCentimeters((heightFeet * 12) + heightInches);
    }
}
