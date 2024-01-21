package com.softserve.edu13.hw.task2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the date in the format  MM.dd.yyyy: ");
        String dateToCheck = scanner.nextLine();

        if (isValidDate(dateToCheck, "MM.dd.yyyy")) {
            System.out.println(dateToCheck + " is a valid date.");
        } else {
            System.out.println(dateToCheck + " is not a valid date.");
        }
    }

    public static boolean isValidDate(String date, String format) {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        sdf.setLenient(false);

        try {
            sdf.parse(date);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }
}
