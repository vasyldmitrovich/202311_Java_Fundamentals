package com.softserve.edu13.hw;

import javax.swing.text.DateFormatter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM.dd.yy");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the date formated as \"mm.dd.yy\":");
        String inputStringDate = scanner.nextLine();
        try {
            System.out.println(LocalDate.parse(inputStringDate, formatter));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
