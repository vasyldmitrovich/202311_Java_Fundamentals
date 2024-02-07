package com.softserve.edu11.hw.homeTask03;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    private static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("\\$[0-9]+(\\.[0-9]{2})?");
        System.out.print("Enter currency: ");
        String string = SCANNER.nextLine();
        Matcher matcher = pattern.matcher(string);
        while (matcher.find()) {
            System.out.println(string.substring(matcher.start(), matcher.end()));
        }
    }
}
