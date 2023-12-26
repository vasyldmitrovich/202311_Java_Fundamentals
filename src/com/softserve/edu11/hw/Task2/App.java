package com.softserve.edu11.hw.Task2;

public class App {
    public static void main(String[] args) {

        String input = "I  am  learning  Java  Fundamental";
        String expected = input.replaceAll("\\s+"," ");

        System.out.printf("Before replacement : %s%n",input);
        System.out.printf("After replacement  : %s",expected);
    }
}
