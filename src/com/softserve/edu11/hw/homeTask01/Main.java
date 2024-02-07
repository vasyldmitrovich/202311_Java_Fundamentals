package com.softserve.edu11.hw.homeTask01;

import java.util.Scanner;

public class Main {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        String words[] = new String[5];
        String input = SCANNER.nextLine();
        words = input.split("\\s+");
        int longestWord = words[0].length();
        int index = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > longestWord) {
                index = i;
            }
        }
        System.out.println("Longest word is '" + words[index] + "' has " + words[index].length() + " letters");
        StringBuilder secondWord = new StringBuilder(words[1]);
        System.out.println("Reversed word: " + secondWord.reverse());

    }

}
