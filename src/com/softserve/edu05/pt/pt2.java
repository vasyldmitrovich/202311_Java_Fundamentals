package com.softserve.edu05.pt;

import java.util.Scanner;

public class pt2 {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter number:");
        int number = SCANNER.nextInt();
        if (isPrime(number)) {
            System.out.println("Is number " + number + " is prime");
        } else {
            System.out.println("Is number " + number + " is not prime");
        }

    }

    public static boolean isPrime(int number) {
        if (number < 0) number = -number;
        if (number == 1) return false;
        for (int i = 2; i <= number - 1; i++) {
            if (number % i == 0) return false;
        }

        return true;
    }
}
