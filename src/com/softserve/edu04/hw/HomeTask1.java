package com.softserve.edu04.hw;
import static com.softserve.edu03.hw.App.SCANNER;

public class HomeTask1 {
    public static void run() {
        double number1;
        double number2;
        double number3;

        System.out.print("Enter number #1: ");
        number1 = Double.parseDouble(SCANNER.nextLine());
        System.out.print("Enter number #2: ");
        number2 = Double.parseDouble(SCANNER.nextLine());
        System.out.print("Enter number #3: ");
        number3 = Double.parseDouble(SCANNER.nextLine());

        if (isInRange(number1) & isInRange(number2) & isInRange(number3)) {
            System.out.println("Numbers in range");
        } else {
            System.out.println("Numbers not in range");
        }
    }

    public static boolean isInRange(double number) {
        if ((number >= -5) && (number <= 5)) {
            return true;
        } else {
            return false;
        }
    }


}
