package com.softserve.edu04.hw;

import java.util.Scanner;

import static com.softserve.edu04.hw.HomeWork4.SCANNER;

public class HomeWork4 {
    public static final Scanner SCANNER = new Scanner( System.in );

    public static void main(String[] args) {

        Faculty fl = new Faculty();
        int numStudents = fl.getNumOfStudents();
        String currentSeason = fl.getCurrentSeason();

        Season jahreszeit = Season.valueOf(currentSeason.toUpperCase());

        switch (jahreszeit) {
            case WINTER -> System.out.println("Our " + numStudents +
                    " students are now preparing for and/or sitting their " + jahreszeit.getSeasonDescription() + ".");
            case SPRING -> System.out.println("Our " + numStudents +
                    " students are now toiling in their " + jahreszeit.getSeasonDescription() + ".");
            case SUMMER -> System.out.println("Our " + numStudents +
                    " students are now enjoying their " + jahreszeit.getSeasonDescription() + ".");
            case AUTUMN -> System.out.println("Our " + numStudents +
                    " students are now toiling in their " + jahreszeit.getSeasonDescription() + ".");
            default -> System.out.println("Something went wrong");
        }
    }
}

class Faculty {
    private int numOfStudents;
    private String currentSeason;

    // constructor
    public Faculty() {
        System.out.print("Enter the number of students: ");
        this.numOfStudents = SCANNER.nextInt();
        SCANNER.nextLine();

        System.out.print("Enter the season: ");
        this.currentSeason = SCANNER.nextLine();;
     }

    public int getNumOfStudents() {
        return numOfStudents;
    }

    public void setNumOfStudents(int numOfStudents) {
        this.numOfStudents = numOfStudents;
    }

    public String getCurrentSeason() {
        return currentSeason;
    }

    public void setCurrentSeason(String currentSeason) {
        this.currentSeason = currentSeason;
    }
}

enum Season {
    WINTER("winter exams"),
    SPRING("spring semester"),
    SUMMER("summer break"),
    AUTUMN("autumn semester");

    final String seasonDescription;

    Season(String seasonDescription) {
        this.seasonDescription = seasonDescription;
    }

    public String getSeasonDescription() {
        return seasonDescription;
    }
}