package com.softserve.edu11.hw.homeTask04;

import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final Pattern PATTERN = Pattern.compile("^[a-zA-Z\\s-]+$");
    private static final  String[] randomGreetings = {
            "Hello, %s %s!",
            "Welcome, %s %s!",
            "Good day, %s %s!",
            "Nice to meet you, %s %s!",
            "How you doing %s %s?"
    };

    public static void main(String[] args) {
        System.out.print("Enter first name: ");
        String firstName = nameInput();
        System.out.print("Enter last name: ");
        String lastName = nameInput();

        Random random = new Random();
        int index = random.nextInt(randomGreetings.length);
        String greeting = randomGreetings[index];
        System.out.printf(greeting, firstName, lastName);

    }

    private static String nameInput() {
        String nameString;
        while (true) {
            nameString = SCANNER.nextLine();
            Matcher matcher = PATTERN.matcher(nameString);
            if (matcher.matches()) {
                break;
            }
            System.out.println("Invalid input. Only English letters, spaces, and hyphens are allowed.");
        }
        return nameString;
    }

}
