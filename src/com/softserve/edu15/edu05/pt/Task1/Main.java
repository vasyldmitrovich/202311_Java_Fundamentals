package com.softserve.edu15.edu05.pt.Task1;

import java.util.Arrays;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1.• Create a string array and sort it.
        String[] stringArray = new String[]{
                "C++", "Ruby", "C", "Java", "8"
        };

        //Sort array
        Arrays.sort(stringArray);

        //Output sorted array
        for (String s : stringArray) {
            System.out.print(s + " ");
        }
        System.out.println();

        //2.Create an array with 5 elements and calculate the average value
        double[] numArray = new double[]{
                8, -1, 3, 0, -13
        };

        double avg = 0;

        for (double v : numArray) {
            avg += v;
        }

        System.out.printf("Average = %.2f\n",avg/5.0);


        //Сheck if the array (any of the previous ones) contains the value ( value enter from the
        //console). Output the result of the search.
        System.out.println("Enter any value: ");

        String input = scanner.nextLine();
        int convertedValue = 0;
        boolean parsable;

        //Check value if it's parsable to integer type by boolean flag "parsable"
        try {
            convertedValue = Integer.parseInt(input);
            parsable = true;
        } catch(NumberFormatException ignored){
            parsable = false;
        }

        //Check array where value is found
        boolean stringFlag = false;
        boolean numFlag = false;

        //Searching in array with string values
        for (String s : stringArray) {
            if (s.equals(input)) {
                stringFlag = true;
                break;
            }
        }

        //if string is parsable to int, search the value in integer array.
        if(parsable) {

            for (double v : numArray) {
                if (v == convertedValue) {
                    numFlag = true;
                    break;
                }
            }
        }

        //Searching result printing
        if(stringFlag && numFlag){
            System.out.printf("%s is found in both arrays",input);
        } else if (stringFlag){
            System.out.printf("%s is found in string array",input);
        } else if (numFlag){
            System.out.printf("%s is found in numbers array",input);
        } else {
            System.out.println("The following value is not found");
        }



    }
}
