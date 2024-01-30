package com.softserve.edu12.hw.hw1;

import java.util.Scanner;

public class hw1 {
    private static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {

        double x = 0;
        double y = 0;
        try {
            System.out.println("x:");
            x = SCANNER.nextDouble();

            System.out.println("y:");
            y = SCANNER.nextDouble();

            double s = div(x,y);
            System.out.println("x/y=" + s);
        } catch (Exception e) {
            System.out.println("Invalid number format, double type required");
        }



    }
    static double div(double x,double y){
        return x/y;
    }
}
