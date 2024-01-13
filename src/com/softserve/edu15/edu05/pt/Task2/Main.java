package com.softserve.edu15.edu05.pt.Task2;

import java.util.Scanner;

public class Main {

    public static void checkNumber (int number){

        boolean flag = false;
        int m = number / 2;

        if(number == 0 ||number == 1){
            System.out.println(number + " is not prime number");
        } else {
            for(int i = 2; i <= m ; i++){
                if(number % i == 0){
                    System.out.println(number + " is not prime number");
                    flag = true;
                    break;
                }
            }
            if(!flag)  {
                System.out.println(number + " is prime number");
            }
        }
    }

    public static void main(String[] args) {
        //Task 2.
        // Write a Java program that asks the user to enter a positive integer and determines
        //whether it is a prime number. If the number is prime, output a message“Is a prime
        //number.Otherwise, output a message“Is not prime number”

        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.println("Enter positive integer number");

        do {
            number = scanner.nextInt();
            if(number < 1 ){

                System.out.println("Please, enter positive number!");
            }
        } while (number < 1);

        checkNumber(number);




    }


}
