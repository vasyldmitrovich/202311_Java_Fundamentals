package com.softserve.edu13.hw;

import java.time.format.DateTimeFormatter;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the year with number yyyy: ");
        int inputYear = Integer.parseInt(scanner.nextLine());
        GregorianCalendar calendar = new GregorianCalendar();
        String partOfMessage = calendar.isLeapYear(inputYear)?"is leap.":"is not leap.";
        try {
            System.out.println("This year " + partOfMessage);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
