package com.softserve.edu13.hw.Task3;

import java.time.LocalDate;
import java.time.Year;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the year");
        var year = Integer.parseInt(scanner.nextLine());

        if(Year.isLeap(year)){
            System.out.println(year + " is leap!");
        } else{
            System.out.println(year + " is not leap!");
        }

    }
}
