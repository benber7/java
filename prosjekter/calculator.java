package prosjekter;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            double num1, num2;
            
            System.out.println("----------------------------------");
            System.out.println("Enter the numbers");
            System.out.println("----------------------------------");
            System.out.println("");
            num1 = input.nextDouble();
            num2 = input.nextDouble();
            System.out.println("");
            System.out.println("----------------------------------");
            System.out.println("Enter the operator: +, -, /, *");
            System.out.println("----------------------------------");
            System.out.println("");

            char operator = input.next().charAt(0);
            double result = 0;
            
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '/':
                    result = num1 / num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                default:
                    System.out.println("");
                    System.out.println("----------------------------------");
                    System.out.println("You entered a invalid operation");
                    System.out.println("----------------------------------");

            }
            System.out.println("----------------------------------");
            System.out.println("Your numbers where: " + num1 + " and " + num2 + ".");
            System.out.println("Your operation was: " + operator + ".");
            System.out.println("");
            System.out.println("And your result is: " + result);
            System.out.println("----------------------------------");
        }
    }   
}