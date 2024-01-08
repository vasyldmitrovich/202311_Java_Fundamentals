package com.softserve.edu11.hw;

import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Homework4 {
    public static final Scanner SCANNER = new Scanner( System.in );

    public static void main(String[] args) {
        String firstName = promptUserForName("first");
        String secondName = promptUserForName("second");
        greatTheUser(firstName, secondName);
    }

    static String promptUserForName( String text ) {
        String name = null;
        while( true ) {
            System.out.print("Please enter the " + text + " name: ");
            name = SCANNER.nextLine();
            boolean test = checkNameForValidity( name );
            if( test ) {
                break;
            } else {
                System.out.println("You have entered an invalid name.  A valid name should contain only English letters, spaces and hyphens.");
            }
        }
        return name;
    }

    static boolean checkNameForValidity( String name ) {
        String pattern = "^(([A-Z]{1})([a-z]+))|((([A-Z]{1})([a-z]+))(( ){1}|-{1})([A-Z]{1})([a-z]+)*)$";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher( name );
        if( m.find() ) {
            return true;
        } else {
            return false;
        }
    }

    static void greatTheUser(String firstName, String secondName ) {
        String[] greetings = {
                "Hi,",
                "Hello,",
                "Hey what's up,",
                "How are you doing,",
                "How have you been,",
        };
        Random rnd = new Random();
        int index = rnd.nextInt(0, 5);
        System.out.printf("%s %s %s.\n", greetings[index], firstName, secondName );
    }
}
