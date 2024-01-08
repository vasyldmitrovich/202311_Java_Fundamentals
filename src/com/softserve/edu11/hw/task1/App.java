package com.softserve.edu11.hw.task1;

import java.util.Scanner;

public class App {//Good
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the sentence with 5 words: ");
        String sentence = scanner.nextLine();
        String[] arr = sentence.split(" ");
        String maxLengs = "";
        for (var a : arr) {
            if (a.length() > maxLengs.length()) {
                maxLengs = a;
            }
        }
        System.out.println("The longest word is: " + maxLengs);
        System.out.println("Number the letters in the longest word is: " + maxLengs.length());
        System.out.println(new StringBuffer(arr[1]).reverse());
    }
}
