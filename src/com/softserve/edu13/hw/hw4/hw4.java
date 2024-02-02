package com.softserve.edu13.hw.hw4;

import java.time.LocalDate;
import java.time.Month;

public class hw4 {
    public static void main(String[] args) {
        LocalDate birthday = LocalDate.of(1982, Month.SEPTEMBER, 29);
        dayOfWeek(birthday);

    }

    static void dayOfWeek(LocalDate birthday) {
        System.out.println(" Day of week " + birthday + " " + birthday.getDayOfWeek());
        System.out.println(" Day of week " + birthday.plusMonths(6) + " " + birthday.plusMonths(6).getDayOfWeek());
        System.out.println(" Day of week " + birthday.plusYears(1) + " " + birthday.plusYears(1).getDayOfWeek());
    }

}
