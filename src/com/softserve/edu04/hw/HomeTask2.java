package com.softserve.edu04.hw;

import static com.softserve.edu04.hw.App.SCANNER;

public class HomeTask2 {
    public static void run() {
        int number1;
        int number2;
        int number3;
        System.out.print("Enter number1: ");
        number1 = Integer.parseInt(SCANNER.nextLine());
        System.out.print("Enter number2: ");
        number2 = Integer.parseInt(SCANNER.nextLine());
        System.out.print("Enter number3: ");
        number3 = Integer.parseInt(SCANNER.nextLine());
        System.out.println("MAX number: " + maxNumber(maxNumber(number1, number2), number3));
        System.out.println("MIN number: " + minNumber(minNumber(number1, number2), number3));
    }

    public static int minNumber(int a, int b) {
        return a < b ? a : b;
    }

    public static int maxNumber(int a, int b) {
        return a > b ? a : b;
    }


}
