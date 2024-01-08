package com.softserve.edu13.hw;

import java.time.LocalDate;

public class Task4 {
    public static void main(String[] args) {
        LocalDate dateOfBirth = LocalDate.of(1978, 9, 1);
        LocalDate afterSixMonths = dateOfBirth.plusMonths(6);
        LocalDate afterYear = dateOfBirth.plusMonths(12);
        System.out.println(dateOfBirth.getDayOfWeek());
        System.out.println(afterSixMonths.getDayOfWeek());
        System.out.println(afterYear.getDayOfWeek());
    }
}
