package com.softserve.pt;

import java.util.Scanner;

public class pt2 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        System.out.println("Enter the day of the week number");
        int numberDay = sc.nextInt();
        DayOfWeek dayOfWeek = DayOfWeek.getByNumber(numberDay);
        System.out.println("UA:" + dayOfWeek.ua);
        System.out.println("EN:" + dayOfWeek.en);

    }

    enum DayOfWeek {
        MONDAY("Понеділок","Monday"), TUESDAY("Вівторок","Tuesday"), WEDNESDAY("Середа","Wednesday"), THURSDAY("Четверг","Thursday"), FRIDAY("П`ятниця","Friday"), SATURDAY("Субота","Saturday"), SUNDAY("Неділя","Sunday");
        public final String ua;
        public final String en;

        DayOfWeek(String ua, String en) {
            this.ua = ua;
            this.en = en;
        }

        public static DayOfWeek getByNumber(int number) {
            return switch (number) {
                case 1 -> MONDAY;
                case 2 -> THURSDAY;
                case 3 -> WEDNESDAY;
                case 4 -> THURSDAY;
                case 5 -> FRIDAY;
                case 6 -> SATURDAY;
                case 7 -> SUNDAY;
                default -> null;
            };
        }
    }
}
//     public static String nameDayWeek(int numberDay) {
//
//        switch (numberDay) {
//            case 1 -> {
//                return "Понеділок,Monday";
//            }
//            case 2 -> {
//                return "Вівторок,Tuesday";
//            }
//
//            case 3 -> {
//                return "Середа,Wednesday";
//            }
//            case 4 -> {
//                return "Четверг,Thursday";
//            }
//            case 5 -> {
//                return "П`ятниця,Friday";
//            }
//            case 6 -> {
//                return "Субота,Saturday";
//            }
//
//            case 7 -> {
//                return "Неділя,Sunday";
//            }
//            default -> {
//                return "there is no such day of the week";
//            }
//        }
//    }



