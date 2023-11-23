package com.softserve.edu02.pt;

import java.util.Scanner;

public class T1_TwoNums {

    public static void main(String[] args) {

        double firstNum;
        double secondNum;

        firstNum = getNumber("Enter first number");
        secondNum = getNumber("Enter second number");

        double total = total(firstNum,secondNum);
        double average = average(firstNum,secondNum);

        if(total % 1 == 0) {
            System.out.printf("The total of %.0f and %.0f is %.0f \n", firstNum,secondNum,total);
        } else {
            System.out.printf("The total of %.0f and %.0f is %.1f \n", firstNum,secondNum,total);
        }

        if(average % 1 == 0) {
            System.out.printf("The average of %.0f and %.0f is %.0f", firstNum,secondNum,average);
        } else {
            System.out.printf("The average of %.0f and %.0f is %.1f", firstNum,secondNum,average);
        }


    }


    public static double getNumber (String prompt){

        Scanner scanner = new Scanner(System.in);
        System.out.println(prompt);

        return scanner.nextDouble();
    }

    public static double total (double firstNum, double secondNum)
    {
        return firstNum + secondNum;
    }

    public static double average (double firstNum, double secondNum)
    {
        return (firstNum + secondNum) / 2.0;
    }

}
