package edu11.hw.task4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first name and the last name: ");
        String sentence = scanner.nextLine();
        Pattern p = Pattern.compile("\\b[A-Za-z-]*\\b \\b[A-Za-z-]*\\b");
        Matcher matcher = p.matcher(sentence);
        while (!matcher.matches()) {
            System.out.println("The first name or the last name does not correct: ");
            sentence = scanner.nextLine();
            matcher = p.matcher(sentence);
        }
        List<String> greetings = new ArrayList<>();
        greetings.add("Sucsess! You are %s!%n");
        greetings.add("Be happy, %s!%n");
        Random rand = new Random();
        int randomIndex = rand.nextInt(greetings.size());
        String randomElement = greetings.get(randomIndex);
        System.out.printf(randomElement, sentence);
    }
}
