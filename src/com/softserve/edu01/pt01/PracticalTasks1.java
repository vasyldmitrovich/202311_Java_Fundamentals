package com.softserve.edu01.pt01;

import java.util.Scanner;

public class PracticalTasks1 {

    public void text(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input three strings");
        String st1 = sc.next();
        String st2 = sc.next();
        String st3 = sc.next();
        System.out.println(st3);
        System.out.println(st2);
        System.out.println(st1);
    }
    public void number(){
        Scanner sc = new Scanner(System.in);
        System.out.println("input first number = ");
        double number1 = sc.nextDouble();
        System.out.println("input second number = ");
        double number2 = sc.nextDouble();
        System.out.println("input third number = ");
        double number3 = sc.nextDouble();
        double average = ((number1 + number3 + number2) / 3) ;
        System.out.println("The average of the numbers = " + average);
    }

    public void calculateOfNumbers(){
        Scanner sc = new Scanner(System.in);
        System.out.println("input a number = ");
        double a = sc.nextDouble();
        System.out.println("input b = ");
        double b = sc.nextDouble();
        double addition   = a + b;
        double multiplication = a * b;
        double subtraction = a - b;
        double division = a / b;
        System.out.println("addition = " + addition);
        System.out.println("subtraction = " + subtraction);
        System.out.println("multiplication = " + multiplication);
        System.out.println("division = " + division);
    }

    public void question(){
        Scanner sc = new Scanner(System.in);
        System.out.println("How are you?");
        String answer = sc.next();
        System.out.println("I am " + answer);
    }


    public static void main(String[] args) {
        PracticalTasks1 practicalTasks1 = new PracticalTasks1();
        practicalTasks1.text();
        practicalTasks1.number();
        practicalTasks1.calculateOfNumbers();
        practicalTasks1.question();
    }
}
