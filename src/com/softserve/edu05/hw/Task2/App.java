package com.softserve.edu05.hw.Task2;

import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        /* Create a do-while loop that prompts the user to enter two numbers and calculates their
sum. After displaying the result, the program should ask the user if they want to perform
the operation again. If the user inputs a positive response, the loop should repeat;
otherwise, it should terminate.*/

        Scanner scanner = new Scanner(System.in);
        int a;
        int b;
        String input;

        do {
            System.out.print("Enter a = ");
            a = Integer.parseInt(scanner.nextLine());
            System.out.print("Enter b = ");
            b = Integer.parseInt(scanner.nextLine());

            System.out.printf("Result = %d\n", a + b);

            System.out.println("Do you want to continue?" +
                    "\nNo - for exit, any key to continue.");

            input = scanner.nextLine().toUpperCase(Locale.ROOT);

        } while(!input.equals("NO"));
    }
}
