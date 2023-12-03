package com.softserve.edu04.hw.HomeTask4;

import static com.softserve.edu04.hw.App.SCANNER;

public class HomeTask4 {
    public static void run() {
        Faculty faculty = new Faculty();
        System.out.print("Enter the number of students: ");
        faculty.setStudentsCount(Integer.parseInt(SCANNER.nextLine()));
        System.out.print("Enter season: ");
        faculty.setSeason(SCANNER.nextLine().toUpperCase());
        System.out.println(faculty);
    }
}
