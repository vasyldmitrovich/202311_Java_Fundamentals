package com.softserve.edu04.pt.PraticalTask2;

import static com.softserve.edu04.pt.App.SCANNER;

public class PracticalTask2 {
    public static void run() {
        System.out.print("Enter the day of week ordinal: ");
        int dayOfWeek = SCANNER.nextInt();
        MyDayOfWeek day = MyDayOfWeek.values()[dayOfWeek % 7];
        System.out.println("English: " + day.getEn() + "\nUkrainian: " + day.getUa());
    }


}
