package com.softserve.edu04.pt;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in );
        int counter;
        counter = 0;

        System.out.println("Enter three whole numbers:");
        System.out.print("number one: ");
        int num1 = sc.nextInt();
        System.out.print("number two: ");
        int num2 = sc.nextInt();
        System.out.print("number three: ");
        int num3 = sc.nextInt();

        if ( num1 % 2 != 0 ) {
            counter++;
        }

        if ( num2 % 2 != 0 ) {
            counter++;
        }

        if ( num3 % 2 != 0 ) {
            counter++;
        }

        if ( counter == 1 ) {
            System.out.println("You've entered one odd number.");
        } else {
            System.out.println("You've entered " + counter + " odd numbers.");
        }
    }
}
