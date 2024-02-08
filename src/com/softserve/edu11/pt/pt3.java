package com.softserve.edu11.pt;

import java.util.Scanner;
import java.util.function.Predicate;
import java.util.regex.Pattern;

public class pt3 {
    private static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        Predicate<String> p = Pattern.compile("^\\w{3,15}$").asPredicate();
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter username:");
            String username = SCANNER.nextLine();
            if (p.test(username)){
                System.out.println("Username '" + username + "' is valid");
            }
            else {
                System.out.println("Username '" + username + "' is not valid");
            }
        }



    }
}
