package com.softserve.edu04.pt.task1;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oddCounter = 0;
        for (int i = 0; i <= 2; i++) {
            System.out.println("Enter the number: ");
            int num = scanner.nextInt();
            if (num % 2 != 0) oddCounter++;
            scanner.nextLine();
        }
        System.out.println("Count of odd: " + oddCounter);
    }
}
