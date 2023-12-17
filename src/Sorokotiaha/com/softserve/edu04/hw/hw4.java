package Sorokotiaha.com.softserve.edu04.hw;

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

class Faculty {
    private int numberOfStudents;
    private Season currentSeason;

    public Faculty(int numberOfStudents, Season currentSeason) {
        this.numberOfStudents = numberOfStudents;
        this.currentSeason = currentSeason;
    }

    @Override
    public String toString() {
        return "Faculty{" + "numberOfStudents=" + numberOfStudents + ", currentSeason=" + currentSeason + '}';
    }
}

enum Season {
    WINTER("the period of winter exams"), SPRING("second semester"), SUMMER("the vacation period"), AUTUMN("first semester");
    private String semester;

    Season(String semester) {
        this.semester = semester;
    }
    public static Season getSeason(String season){
        return switch (season){
            case "WINTER" -> WINTER;
            case "SPRING" -> SPRING;
            case "SUMMER" -> SUMMER;
            case "AUTUMN" -> AUTUMN;
            default -> throw new IllegalStateException("Unexpected value: " + season);
        };


    }
}
