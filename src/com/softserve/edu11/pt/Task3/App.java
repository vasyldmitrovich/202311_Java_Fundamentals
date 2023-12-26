package com.softserve.edu11.pt.Task3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {
    public static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {

        Pattern pattern = Pattern.compile("^[\\w]{3,15}$");
        String input;

        for (int i = 0; i < 5 ; i++) {
            System.out.println("Enter username");
            input = SCANNER.nextLine();
            Matcher matcher = pattern.matcher(input);
            if(matcher.matches()){
                System.out.println("Username is ok");
            } else{
                System.out.println("Not ok");
            }
        }

    }
}
