public class megaByte {
    public static void main(String[] args) {
        
    }

    public static void printMegaBytesAndKiloBytes (int kiloBytes) {
        int megaBytes = kiloBytes % 1024; kiloBytes = kiloBytes - (megaBytes * 1024);
        

        System.out.println(megaBytes+"MB and " + kiloBytes + "KB");
    }
}
