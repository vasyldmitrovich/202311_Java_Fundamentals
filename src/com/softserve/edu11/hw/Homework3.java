package com.softserve.edu11.hw;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Homework3 {
    public static final Scanner SCANNER = new Scanner( System.in );

    public static void main(String[] args) {
        System.out.println("Enter a few monetary amounts in the format of US Dollar [$1231.12]");
        String input = null;
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + ": ");
            input = SCANNER.nextLine();
            applyRegExMatcher(input);
        }
    }
    static void applyRegExMatcher( String input ) {
        String pattern = "\\$\\d*(\\.)(\\d{2}$)";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(input);
        if( m.find() ) {
            System.out.println("This input does match the US Dollar format for a monetary amount.");
        } else {
            System.out.println("This input does not match the US Dollar format for a monetary amount.");
        }
    }
}
