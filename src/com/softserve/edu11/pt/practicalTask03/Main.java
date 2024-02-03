package com.softserve.edu11.pt.practicalTask03;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    private static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        var p = Pattern.compile("^\\w{3,15}$").asPredicate();
        for (int i = 0; i < 5; i++){
            String username = SCANNER.nextLine();
            if(p.test(username)) {
                System.out.println("Username '" + username + "' is valid");
            } else {
                System.out.println("Username '" + username + "' is NOT valid");
            }
        }

    }
}
