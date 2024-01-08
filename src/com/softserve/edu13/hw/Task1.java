package com.softserve.edu13.hw;

public class Task1 {//Nice
    public static void main(String[] args) {
        System.out.println(encrypt("wxy", 3));
        System.out.println(decrypt("abc", 4));
    }

    static String encrypt(String s, int n){
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String rezult = "";
        for (int i=0; i<s.length();i++) {
            int newIndex = (alphabet.indexOf(s.charAt(i)) + n)%26;
            rezult = rezult + alphabet.charAt(newIndex);
        }
        return rezult;
    }

    static String decrypt(String s, int n){
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String rezult = "";
        for (int i=0; i<s.length();i++) {
            int newIndex = (26 + alphabet.indexOf(s.charAt(i)) - n)%26;
            rezult = rezult + alphabet.charAt(newIndex);
        }
        return rezult;
    }
}
