package com.softserve.edu01.additionalTasks;

import java.util.Scanner;

public class MultiplyingTwoNums {
    public static Scanner scanner = new Scanner(System.in);


    public static int multiply (int a,int b){
        return a * b;
    }
    public static void main(String[] args) {

        //Implement a function called multiply, which takes two numbers and returns their product:
        System.out.println("Enter a: ");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter b: ");
        int b = Integer.parseInt(scanner.nextLine());

        System.out.printf("Result = %d", multiply(a,b));
    }
}
