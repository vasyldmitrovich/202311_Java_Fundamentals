package com.softserve.edu04.hw;

import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in );

        int counter = 0;

        System.out.println("Enter three numbers:");
        System.out.print("number one: ");
        float num1 = sc.nextFloat();
        System.out.print("number two: ");
        float num2 = sc.nextFloat();
        System.out.print("number three: ");
        float num3 = sc.nextFloat();

        if ( (num1 >= -5) && (num1 <= 5) ) {
            counter++;
        }

        if ( (num2 >= -5) && (num2 <= 5) ) {
            counter++;
        }

        if ( (num3 >= -5) && (num3 <= 5) ) {
            counter++;
        }

        switch ( counter ) {
            case 0:
                System.out.println("None of the numbers you've entered falls within range [-5, 5].");
                break;
            case 1:
                System.out.println("One of the numbers you've entered falls within range [-5, 5].");
                break;
            case 2:
                System.out.println("Two of the numbers you've entered fall within range [-5, 5].");
                break;
            default:
                System.out.println("All three numbers you've entered fall within range [-5, 5].");
                break;
        }
    }
}
