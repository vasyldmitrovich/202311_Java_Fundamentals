package com.softserve.edu05.hw.task1;

import java.util.Arrays;
import java.util.Random;

public class AppPart3 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Random rnd = new Random();
        int countPositive = 0;
        int position = 0;
        int positionMin = 0;
        int minNum = 1000;
        int productEven = 1;
        for(int i=0; i < arr.length; i++){
            arr[i] = rnd.nextInt(-100,100);
            if (arr[i] >= 0) {
                countPositive ++;
                if (countPositive == 2){ position = i+1;}
            }
            if (Math.min(minNum, arr[i]) == arr[i]){
                minNum = arr[i];
                positionMin = i+1;
            }
            if (arr[i]%2 == 0){
                productEven *= arr[i];
            }

        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Position the second positive number: " + position);
        System.out.println("Position the minimum number is: " + positionMin + ", minimum is: " + minNum);
        System.out.println("Product off all even numbers: " + productEven);
    }
}
