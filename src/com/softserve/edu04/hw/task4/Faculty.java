package com.softserve.edu04.hw.task4;

import java.util.Scanner;

public class Faculty {
    private int numberOfStudents;
    private Season currentSeason;

    public Faculty(int numberOfStudents, Season currentSeason) {
        this.numberOfStudents = numberOfStudents;
        this.currentSeason = currentSeason;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public Season getCurrentSeason() {
        return currentSeason;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        System.out.println("Choose the current season:");
        System.out.println("1. Winter");
        System.out.println("2. Spring");
        System.out.println("3. Summer");
        System.out.println("4. Autumn");

        System.out.print("Enter the number corresponding to the current season: ");
        int seasonChoice = scanner.nextInt();

        Season currentSeason;
        switch (seasonChoice) {
            case 1:
                currentSeason = Season.WINTER;
                break;
            case 2:
                currentSeason = Season.SPRING;
                break;
            case 3:
                currentSeason = Season.SUMMER;
                break;
            case 4:
                currentSeason = Season.AUTUMN;
                break;
            default:
                System.out.println("Invalid season choice. Defaulting to Winter.");
                currentSeason = Season.WINTER;
                break;
        }

        Faculty faculty = new Faculty(numberOfStudents, currentSeason);

        System.out.println("\nFaculty Information:");
        System.out.println("Number of students: " + faculty.getNumberOfStudents());
        System.out.println("Current season: " + faculty.getCurrentSeason());
    }
}

