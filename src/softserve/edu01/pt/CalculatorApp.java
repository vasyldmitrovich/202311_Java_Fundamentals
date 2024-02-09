package softserve.edu01.pt;

import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Task 1: Read integer values a and b from the console
        System.out.print("Enter the value of a: ");
        int a = scanner.nextInt();

        System.out.print("Enter the value of b: ");
        int b = scanner.nextInt();

        // Task 1: Perform calculations and output results
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));

        // Check if b is not zero to avoid division by zero
        if (b != 0) {
            System.out.println("a / b = " + ((double) a / b));
        } else {
            System.out.println("Cannot divide by zero.");
        }

        // Task 4*: Read and output the answer to "How are you?" question
        System.out.print("How are you? ");
        scanner.nextLine(); // Consume the newline character left after previous input
        String answer = scanner.nextLine();
        System.out.println("You are " + answer);
    }
}

