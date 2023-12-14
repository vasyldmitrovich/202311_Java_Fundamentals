package com.softserve.edu05.pt.task2;

import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        if (isPrime(number)) {
            System.out.println("Is a prime number");
        } else {
            System.out.println("Is not prime number");
        }
    }

    public static boolean isPrime(int num) {
        for (int i = 2; i <= num - 1; i++) {
           if (num % i == 0) return false;
        }
        return true;
    }
}
