package com.softserve.edu01.pt03;

import java.util.Scanner;

public class task02 {

    public static class DayOfWeek {
        public static void main(String[] args) {
            Scanner SCANNER = new Scanner(System.in);
            System.out.print("Enter the number of the day of the week (1-7): ");
            int dayNumber = SCANNER.nextInt();
            SCANNER.close();

            String[] daysEnglish = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
            String[] daysUkrainian = {"Неділя", "Понеділок", "Вівторок", "Середа", "Четвер", "П'ятниця", "Субота"};


            if (dayNumber >= 1 && dayNumber <= 7) {

                String dayNameEnglish = daysEnglish[dayNumber - 1];
                String dayNameUkrainian = daysUkrainian[dayNumber - 1];

                System.out.println("Day of the week in English: " + dayNameEnglish);
                System.out.println("День тижня українською: " + dayNameUkrainian);
            } else {
                System.out.println("Invalid day number! Please enter a number between 1 and 7.");
            }
        }
    }

}
