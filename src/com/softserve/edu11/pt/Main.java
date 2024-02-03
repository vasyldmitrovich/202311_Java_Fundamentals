package com.softserve.edu11.pt;

import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String substring = "Soft*Serve";
        String text = "Soft*Serve Academy";
        System.out.println(text.contains(substring));
        System.out.println(text.matches(".*" + Pattern.quote(substring) + ".*"));
    }
}
