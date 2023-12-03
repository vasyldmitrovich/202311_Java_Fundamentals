package com.softserve.edu04.pt;

import com.softserve.edu04.pt.PracticalTask2.PracticalTask2;
import com.softserve.edu04.pt.PracticalTask3.PracticalTask3;
import com.softserve.edu04.pt.PracticalTask4.PracticalTask4;

import java.util.Scanner;

public class App {
    public static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Task 1");
        PracticalTask1.run();

        System.out.println("\nTask 2");
        PracticalTask2.run();

        System.out.println("\nTask 3");
        PracticalTask3.run();

        System.out.println("\nTask 4");
        PracticalTask4.run();
    }


}
