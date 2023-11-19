package com.softserve.edu01.pt;

import java.util.Scanner;

public class App {

    public static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {

        int choice;

        //Some user friendly interface

        System.out.println("Practical tasks menu");
        System.out.println("0- Exit");
        System.out.println("1- First task");
        System.out.println("2- Second task");
        System.out.println("3- Third task");
        System.out.println("4- Fourth task");

        System.out.println("Your choice : ");
        choice = Integer.parseInt(scanner.nextLine());



            //This part switches a task user want to try
        switch (choice) {
            case 1 -> task1();
            case 2 -> task2();
            case 3 -> task3();
            case 4 -> task4();
            default -> System.out.println("Unknown number!");
        }


    }

    public static void task1 (){


        //This subprogram reads 3 strings and outputs them in reverse order
        String[] strArr = new String[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter " + (i+1) + " string");
            strArr[i] = scanner.nextLine();
        }

        for (int i = 2; i >= 0; i--) {

            System.out.println("String " + (i+1) + ": " + strArr[i]);
        }

        //Simple variant
//        String str1 = scanner.nextLine();
//        String str2 = scanner.nextLine();
//        String str3 = scanner.nextLine();
//
//        System.out.println(str3);
//        System.out.println(str2);
//        System.out.println(str1);
    }

    public static void task2() {

        //This function calculates an average from 3 nums

        double [] numArr = new double[3];
        double result = 0;

        for (int i = 0; i <= 2; i++) {

            System.out.println("Enter " + (i + 1) + " number");
            numArr[i] = Double.parseDouble(scanner.nextLine());

        }

        for (int i = 0; i <= 2; i++) {

            result += numArr[i];

        }

        System.out.println(result / 3.0);



    }

    public static void task3() {

        //This function outputs different operations with "a" and "b" variables
        int a,b;

        System.out.println("Enter a:");
        a = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter b:");
        b = Integer.parseInt(scanner.nextLine());

        System.out.println("a + b = " + (a+b));
        System.out.println("a - b = " + (a-b));
        System.out.println("a * b = " + (a*b));
        System.out.println("a / b = " + ((double)a/b));


    }

    public static void task4() {

        //This function asks user how is he and outputs his answer
        String answer;
        System.out.print("How are you?\n - I'm ");
        answer = scanner.nextLine();
        System.out.println("You are "+ answer + " .");


    }
}
