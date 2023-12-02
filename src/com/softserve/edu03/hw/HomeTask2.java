package com.softserve.edu03.hw;

import static com.softserve.edu03.hw.App.SCANNER;

public class HomeTask2 {
    private static int numberOfNumber = 1;

    public static void run() {
        int num1 = setNumber();
        int num2 = setNumber();
        int num3 = setNumber();
        System.out.println("[Math  method] The smallest number is " + Math.min(Math.min(num1, num2), num3));
        System.out.println("[My method] The smallest number is " + smallestNumber(num1, num2, num3));

    }

    public static int setNumber() {
        System.out.print("Enter number №" + numberOfNumber + ": ");
        numberOfNumber++;
        return Integer.parseInt(SCANNER.nextLine());
    }

    public static int smallestNumber(int n1, int n2, int n3) {
        int minNumber = n1;
        if (n2 < minNumber) {
            minNumber = n2;
        }
        if (n3 < minNumber) {
            minNumber = n3;
        }
        return minNumber;
    }


}
