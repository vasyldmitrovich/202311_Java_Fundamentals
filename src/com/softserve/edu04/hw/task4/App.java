package com.softserve.edu04.hw.task4;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter count of students: ");
        int count = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter season (e.g. winter, spring, e.c.t): ");
        String season = scanner.nextLine();
        Faculty lit = new Faculty(count, season);
        System.out.println(lit);
    }
}
