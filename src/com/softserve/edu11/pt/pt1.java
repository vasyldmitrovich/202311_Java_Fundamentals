package com.softserve.edu11.pt;

public class pt1 {
    public static void main(String[] args) {
        String subString = "SoftServe";
        String text = "SoftServe Academy";
        System.out.println(text.contains(subString));
        System.out.println(text.matches(".*"+subString + ".*"));
    }
}
