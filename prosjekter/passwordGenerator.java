package prosjekter;

import java.io.FileWriter;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.Scanner;

public class passwordGenerator {
    public static void main(String[] args) {
        // Define a character array containing the possible characters for passwords
        char[] characters = {
            'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
            'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z',
            'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M',
            'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z',
            '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
            '!', '@', '#', '$', '%', '&','?'
        };

        // Create a secure random number generator for generating random characters
        SecureRandom secureRandom = new SecureRandom();
        
        // Create a Scanner object to read user input from the console
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of passwords to generate
        System.out.print("Enter the number of passwords to generate: ");
        int numPasswords = scanner.nextInt();

        // Prompt the user to enter the length of each password
        System.out.print("Enter the length of each password: ");
        int passwordLength = scanner.nextInt();

        /*
         * // Prompt the user to assign name to txt file
            System.out.print("Enter the desired name for the txt file: ");
            int txtName = scanner.next();
         */

        // Generate and print the requested number of passwords
        for (int i = 0; i < numPasswords; i++) {
            StringBuilder password = new StringBuilder();

            // Generate the password character by character
            for (int j = 0; j < passwordLength; j++) {
                char randomChar = characters[secureRandom.nextInt(characters.length)];
                password.append(randomChar);
            }

            // Display the generated password
            System.out.println("Generated Password " + (i + 1) + ": " + password.toString());
        }

        // Close the Scanner to release resources
        scanner.close();
    }
}
