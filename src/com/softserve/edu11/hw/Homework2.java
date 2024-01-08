package com.softserve.edu11.hw;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Homework2 {
    public static final Scanner SCANNER = new Scanner( System.in );

    public static void main(String[] args) {
        System.out.print("Please enter a sentence making sure that you input two spaces between individual words: ");
        String input = SCANNER.nextLine();
        input = input.trim();

        String pt1 = "[^a-zA-Z]+";
        String pt2 = " ";

        String refinedInput = input.replaceAll(pt1, pt2);
        System.out.println(refinedInput);
    }
}
