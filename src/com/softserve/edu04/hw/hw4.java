package com.softserve.edu04.hw;

import java.util.Scanner;

public class hw4 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        System.out.print("Enter the season (winter, spring, summer, autumn):");
        String introducedSeason = sc.nextLine();

        System.out.print("Enter the number of students:");
        int numberOfStudents = sc.nextInt();


        introducedSeason = introducedSeason.toUpperCase();
        Season currentSeason = Season.getSeason(introducedSeason);
        Faculty sau = new Faculty(numberOfStudents, currentSeason);
        System.out.println(sau.toString());
        System.out.println(introducedSeason);
    }
}

