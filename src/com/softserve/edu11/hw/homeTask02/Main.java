package com.softserve.edu11.hw.homeTask02;

import java.util.Scanner;

public class Main {
    private static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter sentence : ");
        String string = SCANNER.nextLine();
        System.out.println(string.replaceAll("\\s+", " "));
    }
}
