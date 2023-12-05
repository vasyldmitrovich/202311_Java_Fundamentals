package com.softserve.edu05.hw.task1;

import java.util.Arrays;
import java.util.Random;

public class AppPart2 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random rnd = new Random();
        boolean allFivePositive = true;
        for(int i=0; i < arr.length; i++){
            arr[i] = rnd.nextInt(-100,100);
            if ((i < 5) & ( arr[i]<0)) {
                allFivePositive = false;
            }
        }
        System.out.println(Arrays.toString(arr));
        int result = getSumOrProduct(allFivePositive, arr);
        if (allFivePositive){
            System.out.println("Sum of first five elements: " + result);
        }
        else {
            System.out.println("Product of last five elements: " + result);
        }

    }

    static int getSumOrProduct(boolean allFivePositive, int[] arr) {
        int result;
        if (allFivePositive) {
            result = 0;
            for (int i = 0; i < 5; i++){ result +=arr[i];}
        }
        else {
            result = 1;
            for (int i = 5; i < arr.length; i++){ result *= arr[i];}
        }
        return result;

    }


}
