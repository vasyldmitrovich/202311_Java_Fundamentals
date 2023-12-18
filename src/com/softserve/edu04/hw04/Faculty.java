package com.softserve.edu04.hw04;

import java.util.Scanner;

public class Faculty {

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    public Season getCurrentSeason() {
        return currentSeason;
    }

    public void setCurrentSeason(Season currentSeason) {
        this.currentSeason = currentSeason;
    }

    private int numberOfStudents;
    private Season currentSeason;
    static Scanner scanner = new Scanner(System.in);


    public void inputInformationAboutTheNumberOfStudents() {
        System.out.print(" Enter number of students: ");
        setNumberOfStudents(scanner.nextInt());
        scanner.nextLine();
    }


    public void inputInformationAboutTheSeason() {
        System.out.print(" Enter current season: \n1. Winter \n2. Spring \n3.Summer \n4.Autumn \n");

        switch (scanner.nextLine().toLowerCase()) {
            case "winter" -> currentSeason = Season.WINTER;
            case "spring" -> currentSeason = Season.SPRING;
            case "summer" -> currentSeason = Season.SUMMER;
            case "autumn" -> currentSeason = Season.AUTUMN;
            default -> System.out.println("Please enter correct season value");
        }
    }

    public void outputInformationOfFaculty() {
        if(currentSeason == null){
            System.out.println("Season was not chosen");
        } else {
            System.out.println("\nFaculty information: \n    Number of students: " + numberOfStudents +
                    "\n    Season: " + getCurrentSeason());
        }

    }

    public void menu() {
        System.out.println("insert information about faculty");
        inputInformationAboutTheNumberOfStudents();
        inputInformationAboutTheSeason();
        System.out.println("get information about faculty");
        outputInformationOfFaculty();
    }
}