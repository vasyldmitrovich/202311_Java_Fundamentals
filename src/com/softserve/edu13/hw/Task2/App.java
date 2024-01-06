package com.softserve.edu13.hw.Task2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("MM.dd.yy");
        System.out.println("Enter date following pattern \"mm.dd.yy\"");
        String date = scanner.nextLine();

        System.out.println(LocalDate.parse(date,dateFormat));

    }
}
