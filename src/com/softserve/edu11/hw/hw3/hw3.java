package com.softserve.edu11.hw.hw3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class hw3 {
    public static void main(String[] args) {
        String text = "I  am  $50077.01 learning    Java   Fundamental $77.99$774.99";
        Pattern regexp = Pattern.compile("\\$[0-9,]+\\.[0-9]{2}");

        Matcher match = regexp.matcher(text);
        while(match.find()) {
            System.out.println(match.group());
        }
    }
}
