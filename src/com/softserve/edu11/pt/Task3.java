package com.softserve.edu11.pt;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Task3 {
    public static final Scanner SCANNER = new Scanner( System.in );
    public static void main(String[] args) {
        var p = Pattern.compile("^\\w{3,15}$");
        for (int i = 0; i < 5; i++) {
            String username = SCANNER.nextLine();
            if( p.matcher(username).matches() ) {
                System.out.println("Username " + username  + " is valid.");
            } else {
                System.out.println("Username " + username  + " is not valid.");
            }
        }

        String pattern = "^\\w{3,15}$";
        for (int i = 0; i < 5; i++) {
            String username = SCANNER.nextLine();
            if( username.matches(pattern) ) {
                System.out.println("Username " + username  + " is valid.");
            } else {
                System.out.println("Username " + username  + " is not valid.");
            }
        }
    }
}
