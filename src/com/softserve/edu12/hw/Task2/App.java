package com.softserve.edu12.hw.Task2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Random random = new Random();
        int start = random.nextInt(90) + 1;
        int end = start + 10;
        int [] numbers = new int[10];

        for (int i = 0; i < 10; i++){
            numbers[i] = readNumber(start,end,i);
        }

        System.out.println("Numbers array: ");
        System.out.println(Arrays.toString(numbers));
    }

    private static int readNumber(int start, int end, int iteration){

        Scanner scanner = new Scanner(System.in);

        if(iteration == 0){
            System.out.printf("Enter integer number in range [%d to %d]\n",start,end);
        } else  {
            System.out.printf("Ok! Enter the next one in range [%d to %d]\n",start,end);
        }
        while (true){
            try {
                int number = Integer.parseInt(scanner.nextLine());
                if(number >= start && number <= end){
                    return number;
                } else{
                    throw new IllegalArgumentException("Please try to enter number from " + start + " to " + end);
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
            } catch (IllegalArgumentException e) {
                System.out.println("Number is not within the specified range.\n" +
                        "Please, enter the number from " + start + " to " + end);
            }
        }

    }

}
