package com.softserve.edu05.pt.task2;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = Integer.parseInt(scanner.nextLine());
        boolean isprime = true;
        for (int i = 2; i <= number - 1; i++) {
            if (number % i == 0) {
                isprime = false;
                break;
            }
        }
        if (number == 2) {
            isprime = false;
        }
        if (isprime) {
            System.out.println("The number " + number + " is prime");
        } else {
            System.out.println("The number " + number + " is not prime");
        }
    }
}
