package com.softserve.edu04.hw.task1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        float n1 = Float.parseFloat(scanner.nextLine());
        System.out.println("Enter the second number: ");
        float n2 = Float.parseFloat(scanner.nextLine());
        System.out.println("Enter the third number: ");
        float n3 = Float.parseFloat(scanner.nextLine());
        boolean exp = (-5.0f <= n1) & (n1 <= 5.0f) & (-5.0f <= n2) & (n2 <= 5.0f) & (-5.0 <= n3) & (n3 <= 5.0);
        if (exp) {
            System.out.println("All numbers are included in range [-5:5]");
        } else {
            System.out.println("Not all numbers belong to the range [-5, 5]");
        }
    }

}
