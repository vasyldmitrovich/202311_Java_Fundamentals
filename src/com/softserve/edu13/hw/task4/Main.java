package com.softserve.edu13.hw.task4;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate birthday = LocalDate.parse("2001-10-19", formatter);

        printDayOfWeek(birthday);
        printDayOfWeek(birthday.plusMonths(6));
        printDayOfWeek(birthday.plusMonths(12));
    }

    public static void printDayOfWeek(LocalDate date) {
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        String formattedDate = date.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        System.out.println("For date " + formattedDate + ": " + dayOfWeek);
    }
}
