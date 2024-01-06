package com.softserve.edu13.hw.Task4;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {

        var birthday = LocalDate.of(2001,3,16);
        getInfo(birthday);

    }

    private static void getInfo(LocalDate birthday){

        var dayAfter6Months = birthday.plusMonths(6);
        var dayAfterAYear = birthday.plusYears(1);
        System.out.println("I was born at " + birthday.getDayOfWeek());
        System.out.println("After 6 months from my birthday was " + dayAfter6Months.getDayOfWeek() +
                ", " + dayAfter6Months);
        System.out.println("After a year from my birthday was " + dayAfterAYear.getDayOfWeek() +
                ", " + dayAfterAYear);



    }
}
