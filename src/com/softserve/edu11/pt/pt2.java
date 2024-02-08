package com.softserve.edu11.pt;

import java.util.Scanner;

public class pt2 {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter first name:");
        String firstname = SCANNER.nextLine();
        System.out.println("Enter middle name:");
        String middlename = SCANNER.nextLine();
        System.out.println("Enter last name:");
        String lastname = SCANNER.nextLine();

        System.out.format("%s %S. %S.%n",
                lastname, firstname.charAt(0), middlename.charAt(0));
        System.out.println(firstname);
        System.out.format("%s %s %s %n",
                lastname, firstname, middlename);

    }
}
