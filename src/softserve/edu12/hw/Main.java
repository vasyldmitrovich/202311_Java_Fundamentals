package softserve.edu12.hw;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Task 1
        try {
            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();
            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();
            double result = div(num1, num2);
            System.out.println("Result of division: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero!");
        } catch (InputMismatchException e) {
            System.out.println("Error: Input must be a valid number!");
        }

        // Task 2
        System.out.println("Enter 10 numbers between 1 and 100:");
        for (int i = 1; i <= 10; i++) {
            try {
                int num = readNumber(1, 100);
                System.out.println("Number " + i + ": " + num);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                i--;
            }
        }
    }

    public static double div(double num1, double num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Division by zero!");
        }
        return num1 / num2;
    }

    public static int readNumber(int start, int end) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between " + start + " and " + end + ": ");
        int num = scanner.nextInt();
        if (num < start || num > end) {
            throw new IllegalArgumentException("Number must be in the range [" + start + ", " + end + "]");
        }
        return num;
    }
}
