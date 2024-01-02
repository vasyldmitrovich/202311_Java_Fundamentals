package com.softserve.edu12.hw.Task1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter first number");
            double firstNumber = Double.parseDouble(scanner.nextLine());
            System.out.println("Enter second number");
            double secondNumber = Double.parseDouble(scanner.nextLine());

            double result = div(firstNumber,secondNumber);
            System.out.printf("Result : %.2f.%n",result);

        } catch (NumberFormatException e) {
            System.err.println("Please enter double format number.");
        } catch (ArithmeticException e){
            System.err.println("Error during division. " + e.getMessage());
        } catch (Exception e){
            System.err.println("An unexpected error occurred : " + e.getMessage());
        }

    }
    private static double div(double firstNumber, double secondNumber){

        if(secondNumber == 0){
            throw new ArithmeticException("Division by 0");
        }
        return firstNumber / secondNumber;
    }




}
