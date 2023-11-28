package com.softserve.edu04.hw.Task2;

import java.util.Scanner;

public class Main {

    public static String checkNumbers (int firstNumber, int secondNumber, int thirdNumber){

        int max = firstNumber;
        int min = firstNumber;

        if(secondNumber > max ){
            max = secondNumber;
        } else if(thirdNumber > max){
            max = thirdNumber;
        }

        if(secondNumber < min ){
            min = secondNumber;
        } else if(thirdNumber < min){
            min = thirdNumber;
        }

        return "Max = "+ max + "\n" + "Min = "+ min ;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input first number:");
        int firstNumber = scanner.nextInt();
        System.out.println("Input second number:");
        int secondNumber = scanner.nextInt();
        System.out.println("Input third number:");
        int thirdNumber = scanner.nextInt();

        System.out.println(checkNumbers(firstNumber,secondNumber,thirdNumber));


    }
}
