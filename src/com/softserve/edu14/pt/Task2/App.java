package com.softserve.edu14.pt.Task2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class App {
    public static void main(String[] args) {

        List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);

        var count = primes.stream().
                count();
        System.out.println("Numbers count = " + count);
        var min = primes.stream().min(Integer::compareTo).get();
        System.out.println("Min list value = " + min);
        var max = primes.stream().max(Integer::compareTo).get();
        System.out.println("Max list value = " + max);
        var sum = primes.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Sum of items = " + sum);





    }
}
