package com.softserve.edu12.hw.homeTask1;

import java.util.Scanner;

public class Main {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        double a;
        double b;
        while (true) {
            try {
                System.out.print("Enter a: ");
                a = Double.parseDouble(SCANNER.nextLine());
                System.out.print("Enter b: ");
                b = Double.parseDouble(SCANNER.nextLine());
                double divResult = div(a, b);
                System.out.println("a / b = " + divResult);
                break;
            } catch (NumberFormatException e) {
                //continue
            } catch (ArithmeticException e){
                System.out.println(e.getMessage());
            }
        }

    }

    static double div(double a, double b) {
        return a / b;
    }


}
