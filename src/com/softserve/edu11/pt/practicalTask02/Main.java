package com.softserve.edu11.pt.practicalTask02;

import java.util.Scanner;

public class Main {
    private static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter last name:");
        String lastName = SCANNER.nextLine();
        System.out.println("Enter first name:");
        String firstName = SCANNER.nextLine();
        System.out.println("Enter middle name:");
        String middleName = SCANNER.nextLine();

        System.out.format("%s %S. %S.%n", lastName, firstName.charAt(0), middleName.charAt(0));
        System.out.println(firstName);
        System.out.format("%s %s %s", firstName, middleName, lastName);
    }
}
