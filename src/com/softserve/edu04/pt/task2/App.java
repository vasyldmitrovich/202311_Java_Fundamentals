package com.softserve.edu04.pt.task2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter day's of the week number: ");
        int num = Integer.parseInt(scanner.nextLine());
        String result = switch (num%7) {
            case 1 -> "Monday, Понеділок";
            case 2 -> "Tuesday, Вівторок";
            case 3 -> "Wednesday, Середа";
            case 4 -> "THURSDAY, Четвер";
            case 5 -> "FRIDAY, П'ятниця";
            case 6 -> "SATURDAY, Субота";
            case 0 -> "SUNDAY, Неділя";
            default -> "Оберіть число від 1 до 7";
        };
        System.out.println(result);

    }
}
