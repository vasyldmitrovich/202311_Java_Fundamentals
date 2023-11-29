package com.softserve.edu04.hw.Task4;

import java.util.Locale;
import java.util.Scanner;

public class Faculty {
    public enum Season {

        WINTER("Exams period"),
        SPRING("Second semester"),
        SUMMER("Vacation period"),
        AUTUMN("First semester");


        private final String seasonType;

        Season(String seasonType) {
            this.seasonType = seasonType;
        }

        public String getSeasonType() {
            return seasonType;
        }

        public static String getSeasonType (String choice){

            Season currentSeason = switch (choice) {

                case "WINTER" -> Season.WINTER;
                case "SPRING" -> Season.SPRING;
                case "SUMMER" -> Season.SUMMER;
                case "AUTUMN" -> Season.AUTUMN;
                default -> throw new IllegalStateException("Unexpected value: " + choice);
            };
            return currentSeason.getSeasonType();
        }
    }

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
