package com.softserve.edu13.hw.homeTask2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Main {
    public static void main(String[] args) {
        System.out.println(DateTimeFormatter.ofPattern("MM.dd.yy").format(LocalDate.now()));
    }
}
