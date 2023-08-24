public class primitiveChallenge {
    public static void main(String[] args) {
        byte myByte = 10;
        short myShort = 20;
        int myInt = 50;

        long myTotal = myByte + myShort + myInt;
        System.out.println("Your three numbers combined :" + myTotal);

        long Total = 50000L + (myTotal * 10L);
        System.out.println("Everything combined :" + Total);
    }
}
