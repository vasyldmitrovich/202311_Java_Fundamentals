package com.softserve.edu14.pt.practicalTask2;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
        var result = primes.stream()
                .mapToInt(i -> i)
                .summaryStatistics();
        System.out.println("Highest number in List : " + result.getMax());
        System.out.println("Lowest number in List : " + result.getMin());
        System.out.println("Sum of all numbers : " + result.getSum());
        System.out.println("Count of all numbers : " + result.getCount());
    }
}
