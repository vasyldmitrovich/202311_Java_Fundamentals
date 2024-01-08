package com.softserve.edu11.pt;

import java.util.Scanner;

public class Task2 {
    public static final Scanner SCANNER = new Scanner( System.in );

    public static void main(String[] args) {
        System.out.print("Enter the first name: ");
        String fn = SCANNER.nextLine();
        System.out.print("Enter the middle name: ");
        String mn = SCANNER.nextLine();
        System.out.print("Enter the last name: ");
        String ln = SCANNER.nextLine();

        System.out.printf("%s %S. %S. \n", ln, fn.charAt(0), mn.charAt(0));

        System.out.println(fn);

        System.out.printf("%s %s %s.\n", fn, mn, ln);
    }
}

