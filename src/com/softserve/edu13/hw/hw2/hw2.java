package com.softserve.edu13.hw.hw2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import static java.time.format.DateTimeFormatter.ofPattern;

public class hw2 {
    private static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter date(MM.dd.yy): ");
        String dateText = SCANNER.nextLine();
        DateTimeFormatter formatter = ofPattern("MM.dd.yy");

        try {
            LocalDate parserDate = LocalDate.parse(dateText,formatter);
            System.out.println(parserDate);
        } catch (Exception e) {
            System.out.println("wrong format");
        }

    }
}
