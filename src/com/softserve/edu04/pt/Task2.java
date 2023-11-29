package com.softserve.edu04.pt;

import java.util.Scanner;

public class Task2 {
    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter an integer number of the day of week: ");
        int dayNum = SCANNER.nextInt();
        switchTask2( dayNum );
    }

    public static void switchTask2( int dayNum ) {

        DayOfWeek dia;

        switch( dayNum ) {
            case 0:
                dia = DayOfWeek.SUNDAY;
                System.out.println("English: " + dia.getEn());
                System.out.println("Ukrainian: " + dia.getUa());
                break;
            case 1:
                dia = DayOfWeek.MONDAY;
                System.out.println("English: " + dia.getEn());
                System.out.println("Ukrainian: " + dia.getUa());
                break;
            case 2:
                dia = DayOfWeek.TUESDAY;
                System.out.println("English: " + dia.getEn());
                System.out.println("Ukrainian: " + dia.getUa());
                break;
            case 3:
                dia = DayOfWeek.WEDNESDAY;
                System.out.println("English: " + dia.getEn());
                System.out.println("Ukrainian: " + dia.getUa());
                break;
            case 4:
                dia = DayOfWeek.THURSDAY;
                System.out.println("English: " + dia.getEn());
                System.out.println("Ukrainian: " + dia.getUa());
                break;
            case 5:
                dia = DayOfWeek.FRIDAY;
                System.out.println("English: " + dia.getEn());
                System.out.println("Ukrainian: " + dia.getUa());
                break;
            case 6:
                dia = DayOfWeek.SATURDAY;
                System.out.println("English: " + dia.getEn());
                System.out.println("Ukrainian: " + dia.getUa());
                break;
            default:
                System.out.println("something went wrong");
                break;
        }
    }
}



enum DayOfWeek {
    MONDAY("Понеділок"),
    TUESDAY("Вівторок"),
    WEDNESDAY("Середа"),
    THURSDAY("Четвер"),
    FRIDAY("П'ятниця"),
    SATURDAY("Субота"),
    SUNDAY("Неділя");

    String ua;

    DayOfWeek(String ua) {
        this.ua = ua;
    }

    public String getUa() {
        return ua;
    }

    public String getEn() {
        String day = name();
        return day.charAt(0) + day.substring(1).toLowerCase();
    }
}