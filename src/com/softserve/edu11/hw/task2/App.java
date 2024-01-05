package com.softserve.edu11.hw.task2;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the sentence that contains words separated by more than one space: ");
        String sentence = scanner.nextLine();
        String sentence1 = sentence.replace("  ", " ");
        System.out.println(sentence1);
    }
}
