package com.softserve.edu05.pt.PracticalTask2;

import java.util.Scanner;

/*Write a Java program that asks the user to enter a positive integer and determines
whether it is a prime number. If the number is prime, output a message “Is a prime
number”. Otherwise, output a message “Is not prime number*/
public class PracticalTask2 {
    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter number: ");
        int number = SCANNER.nextInt();
        if (isPrime(number)) {
            System.out.println("The number " + number + " is prime");
        } else {
            System.out.println("The number " + number + " is not prime");
        }

    }

    public static boolean isPrime(int number) {
        if (number < 0) {
            number = -number;
        }
        if (number == 1) {
            return false;
        }
        for (int i = 2; i < number - 1; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
