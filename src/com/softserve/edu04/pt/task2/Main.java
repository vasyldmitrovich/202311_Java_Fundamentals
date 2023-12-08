package com.softserve.edu04.pt.task2;

import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the day of the week:");
        int numberDay = scanner.nextInt();
        DayOfWeek dayOfWeek = DayOfWeek.getByNumber(numberDay);
        System.out.println(dayOfWeek.ua);
        System.out.println(dayOfWeek.en);
    }
}
enum DayOfWeek {
    MONDAY("Monday", "Понеділок"),
    TUESDAY("Tuesday", "Вівторок"),
    WEDNESDAY("Wednesday", "Середа"),
    THURSDAY("Thursday", "Четвер"),
    FRIDAY("Friday", "Пʼятниця"),
    SATURDAY("Saturday", "Субота"),
    SUNDAY("Sunday", "Неділя");

    public final String en;
    public final String ua;

    DayOfWeek(String en, String ua) {
        this.en = en;
        this.ua = ua;
    }

    static DayOfWeek getByNumber(int number) {
        return switch (number) {
            case 1 -> MONDAY;
            case 2 -> TUESDAY;
            case 3 -> WEDNESDAY;
            case 4 -> THURSDAY;
            case 5 -> FRIDAY;
            case 6 -> SATURDAY;
            case 7 -> SUNDAY;
            default -> null;
        };
    }
}


