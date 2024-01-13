package com.softserve.edu15.edu05.hw.Task4;

import java.util.Random;
import java.util.Scanner;

public class App {//Good all is good
    public static void main(String[] args) {

        /*Create a class called Employee with fields: name, department number, salary.
         • In main() method create five objects of class Employee.
         • Output results for:
         oall employees of a certain department (input department number in the console);
         oarrange workers by the field salary in descending order.*/

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt(10000);//from 0 to 10000
        int input;

        System.out.println("Guess the number(from 0 to 10000):");
        do {
            input = scanner.nextInt();
            if(input < randomNumber){
                System.out.println("Too low, try again.");
            }else if(input > randomNumber){
                System.out.println("Too high, try again.");
            } else {
                System.out.println("Congratulations! You guessed the number.");
            }
        } while(input != randomNumber);
    }
}
