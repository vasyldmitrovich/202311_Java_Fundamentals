package com.softserve.edu11.hw.hw4;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class hw4 {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static Pattern patterna_z__A_Z =
            Pattern.compile("^[a-zA-Z/-]+$", Pattern.UNICODE_CASE);

    public static void main(String[] args) {
        System.out.println("Enter your first name, last name, I use only Latin letters, spaces and hyphens:");
        String[] greetingMessage = new String[5];
        greetingMessage[0] = "Hello,";
        greetingMessage[1] = "welcome, ";
        greetingMessage[2] = "Hi, ";
        greetingMessage[3] = "Greetings, ";
        greetingMessage[4] = "Hello my dear friend, ";

        while (true) {
            String text = SCANNER.nextLine();
            if (validation(text)) {
                int i = (int) (Math.random()* 4);
                System.out.printf("" + greetingMessage[i]  + text);
                break;
            }
            System.out.println("incorrect entry, please repeat:");
        }
    }

    static boolean validation(String text) {

        String[] arrayText = text.split(" ");
        for (int i = 0; i < arrayText.length; i++) {
            if (haveOnlya_z__A_Z(arrayText[i]))
                return false;
        }
        return true;
    }


    // точки и подчеркивания соответсвенно
    public static boolean haveOnlya_z__A_Z(String str) {

        Matcher m = patterna_z__A_Z.matcher(str);
        if (m.matches()) {
            return false;
        } else {
            return true;
        }
    }
}
