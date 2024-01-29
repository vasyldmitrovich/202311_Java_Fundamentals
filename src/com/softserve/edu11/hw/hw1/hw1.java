package com.softserve.edu11.hw.hw1;

import java.util.Scanner;

public class hw1 {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        //String text = "ffff zxcv hhh ttt eee";
        String text = SCANNER.nextLine();
        String[] arrayText = wordToArray(text);

        String maxWord = max(arrayText);
        System.out.println(maxWord);
        System.out.println(maxWord.length());

        System.out.println(secondWordBackwards(arrayText));

    }

    static String secondWordBackwards(String[] words) {
        char[] twoWord = words[1].toCharArray();
        String result = "";

        for (int i = twoWord.length - 1; i >= 0; i--) {
            result = result + twoWord[i];
        }
        return result;
    }

    static String max(String[] words) {
        String resstring = "";
        for (String word : words) {
            if (word.length() > resstring.length())
                resstring = word;
        }
        return (resstring);
    }

    static String[] wordToArray(String par) {
        return par.split(" ");
    }

}
