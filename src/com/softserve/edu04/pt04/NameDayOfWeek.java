package com.softserve.edu04.pt04;

import java.util.Scanner;

public class NameDayOfWeek {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the day of week ordinal: ");
        int n = SCANNER.nextInt();
        var day = DayOfWeek.values()[n % 7];
        System.out.println("English" + day.getEn());
        System.out.println("Ukrainian" + day.getUa());

    }
}
