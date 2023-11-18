package com.softserve.edu01.pt;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        // Practical tasks

        // Task 1
        Scanner scanner = new Scanner(System.in);

        String[] strArr = new String[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter " + (i+1) + " string");
            strArr[i] = scanner.nextLine();
        }

        for (int i = 2; i >= 0; i--) {

            System.out.println("String " + (i+1) + ": " + strArr[i]);
        }

//        String str1 = scanner.nextLine();
//        String str2 = scanner.nextLine();
//        String str3 = scanner.nextLine();
//
//        System.out.println(str3);
//        System.out.println(str2);
//        System.out.println(str1);


        // Task 2

        // Task 3...

    }
}
