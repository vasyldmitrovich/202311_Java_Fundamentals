package com.softserve.edu12.hw;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Nice
        try {
            System.out.println("Enter the first number:");
            double a = Double.parseDouble(scanner.nextLine());
            System.out.println("Enter the second number:");
            double b = Double.parseDouble(scanner.nextLine());
            System.out.println(div(a, b));
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        catch (NumberFormatException e){
            System.out.println("Please, enter the double number! " + e.getMessage());
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static double div(double a, double b){
       if (b == 0){
           throw new ArithmeticException("Dividing by 0!");
       }
       return a/b;
    }
}
