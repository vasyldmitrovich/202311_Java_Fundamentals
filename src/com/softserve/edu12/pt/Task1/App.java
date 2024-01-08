package com.softserve.edu12.pt.Task1;

import java.util.Scanner;

public class App {//Good
    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        int a;
        int b;
        while (true) {
            try {
                System.out.println("Enter side a");
                a = Integer.parseInt(SCANNER.nextLine());
                System.out.println("Enter side b");
                b = Integer.parseInt(SCANNER.nextLine());
               int area =  rectangleArea(a,b);
                System.out.println("Area = " + area);
                break;
            } catch (NumberFormatException e){
                System.out.println("Enter integer number");
            } catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
        }

    }


    public static int rectangleArea (int a, int b){

        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("Sides should be non negative. a = " + a + " b = " + b + ".");
        }
        return a * b;

    }
}
