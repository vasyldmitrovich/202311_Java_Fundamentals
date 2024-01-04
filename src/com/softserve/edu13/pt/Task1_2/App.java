package com.softserve.edu13.pt.Task1_2;

import java.time.LocalDate;
import static java.time.DayOfWeek.MONDAY;
import static java.time.temporal.TemporalAdjusters.firstInMonth;

public class App {
    public static void main(String[] args) {

        System.out.println("Today is a : " +
                LocalDate.now().getDayOfWeek());//First point
        System.out.println("First monday in this month : " +
                LocalDate.now().with(firstInMonth(MONDAY)));//Second point

    }
}



