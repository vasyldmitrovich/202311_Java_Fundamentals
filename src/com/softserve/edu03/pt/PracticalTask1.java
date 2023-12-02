package com.softserve.edu03.pt;

import static com.softserve.edu03.pt.App.SCANNER;

public class PracticalTask1 {
    private static int countOfNumbers = 1;

    public static void run() {
        int number1;
        int number2;
        number1 = getNumber();
        number2 = getNumber();
        System.out.println("The sum of " + number1 + " and " + number2 + " is: " + getTotal(number1, number2));
        System.out.println("The average of " + number1 + " and " + number2 + " is: " + getAverage(number1, number2));
    }

    public static int getNumber() {
        System.out.print("Enter number №" + countOfNumbers + ": ");
        countOfNumbers++;
        return Integer.parseInt(SCANNER.nextLine());
    }

    public static int getTotal(int n1, int n2) {
        return n1 + n2;
    }

    public static double getAverage(int n1, int n2) {
        return getTotal(n1, n2) / 2.0;
    }
}
