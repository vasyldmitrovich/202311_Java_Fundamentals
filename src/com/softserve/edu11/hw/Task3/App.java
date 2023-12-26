package com.softserve.edu11.hw.Task3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter text containing US currency format:");
        String inputText = scanner.nextLine();

        displayCurrencyOccurrences(inputText);
    }
    public static void displayCurrencyOccurrences(String input){

        String usdPattern = "\\$\\d+(\\.\\d{2})?";
        Pattern pattern = Pattern.compile(usdPattern);
        Matcher matcher = pattern.matcher(input);

        System.out.println("Occurrences of US currency format:");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }

    }

}
