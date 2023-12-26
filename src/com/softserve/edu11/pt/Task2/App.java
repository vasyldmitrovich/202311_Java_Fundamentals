package com.softserve.edu11.pt.Task2;

import java.util.Scanner;

public class App {
    public static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Input first name");
        String firstName =SCANNER.nextLine();
        System.out.println("Input middle name");
        String middleName =SCANNER.nextLine();
        System.out.println("Input last name");
        String lastName =SCANNER.nextLine();

        System.out.printf("%C%s %C %C %n",lastName.charAt(0),lastName.substring(1),firstName.charAt(0),middleName.charAt(0));
        //It always will be in capital case
        System.out.printf("%C%s %n",lastName.charAt(0),lastName.substring(1));
        //It always will be in capital case
        System.out.printf("%C%s %C%s %C%s %n",firstName.charAt(0),firstName.substring(1),
                middleName.charAt(0),middleName.substring(1),
                lastName.charAt(0),lastName.substring(1));
        //It always will be in capital case


    }
}
