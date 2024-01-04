package com.softserve.edu13.pt.Task4;

import java.util.function.Predicate;

public class App {
    public static void main(String[] args) {
        int[] integers = new int[] {
           0,1,2,3,4,5,6,7,8,9
        };
        System.out.println("Even numbers = " + count(integers, integer -> integer % 2 == 0));
        System.out.println("Odd numbers count = " + count(integers, integer -> integer % 2 != 0));
        System.out.println("Numbers greater than 3 = " + count(integers, integer -> integer > 3));
        System.out.println("Count of numbers less than 0 = " + count(integers, integer -> integer < 0));


    }
    static int count( int[] integers, Predicate<Integer> condition){
        int count = 0;
        for (var n : integers){
            if (condition.test(n)){
                count++;
            }
        }
        return count;
    }
}
