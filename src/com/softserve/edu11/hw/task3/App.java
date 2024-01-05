package com.softserve.edu11.hw.task3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the sentence that contains containing several instances of US currency format: ");
        String sentence = scanner.nextLine();
        Pattern p = Pattern.compile("[$]\\d*.\\d{2}");
        Matcher matcher = p.matcher(sentence);
        while (matcher.find()) {
            System.out.println(sentence.substring(matcher.start(), matcher.end()));
        }
    }

}
