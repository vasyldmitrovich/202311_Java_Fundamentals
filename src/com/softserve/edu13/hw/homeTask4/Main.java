package com.softserve.edu13.hw.homeTask4;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    private static final DateTimeFormatter UKRAINE_FORMAT = DateTimeFormatter.ofPattern("dd.MM.yyyy");
    public static void main(String[] args) {
        LocalDate birthday = LocalDate.of(2013,8,13);
        dayOfTheWeekOnTheBirthday(birthday);
        dayOfTheWeekOnTheBirthdayAfter6Month(birthday);
        dayOfTheWeekOnTheBirthdayAfter12Month(birthday);
    }

    static void dayOfTheWeekOnTheBirthday(LocalDate birthday){
        System.out.println("Date: " + UKRAINE_FORMAT.format(birthday) + ". Day of week in birthday was " + birthday.getDayOfWeek());

    }
    static void dayOfTheWeekOnTheBirthdayAfter6Month(LocalDate birthday){
        LocalDate newDate = birthday.plusMonths(6);
        System.out.println("Date: " + UKRAINE_FORMAT.format(newDate) + ". Day of the week in after 6 months was "
                + newDate.getDayOfWeek());
    }
    static void dayOfTheWeekOnTheBirthdayAfter12Month(LocalDate birthday){
        LocalDate newDate = birthday.plusMonths(12);
        System.out.println("Date: " + UKRAINE_FORMAT.format(newDate) + ". Day of the week in after 12 months was "
                + newDate.getDayOfWeek());
    }



}
