package com.softserve.edu04.pt;

import static com.softserve.edu04.pt.App.SCANNER;

public class PracticalTask1 {
    private static int countOddNumbers;

    public static void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.print("Enter number #" + i + ": ");
            if (SCANNER.nextInt() % 2 == 1) {
                countOddNumbers++;
            }
        }
        SCANNER.nextLine();
        System.out.println("Odd numbers count: " + countOddNumbers);
    }
}
