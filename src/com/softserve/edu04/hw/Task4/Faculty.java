package com.softserve.edu04.hw.Task4;

import java.util.Locale;
import java.util.Scanner;

public class Faculty {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of students");
        int numberOfStudents = Integer.parseInt(scanner.nextLine());
        System.out.println("Choose the current season (Winter/Spring/Summer/Autumn)!");
        String input = scanner.nextLine();

        System.out.println("Faculty information:");
        System.out.printf("Number of students = %d\n",numberOfStudents);
        System.out.printf("Current season : %s\n",Season.getSeasonType(input.toUpperCase(Locale.ROOT)));
    }
}
