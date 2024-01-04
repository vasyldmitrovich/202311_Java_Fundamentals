package com.softserve.edu13.pt.practicalTask4;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Integer[] ints = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Total elements: " + count(ints, (i) -> true));
        System.out.println("Even elements: " + count(ints, (i) -> i % 2 == 0));
        System.out.println("Odd elements: " + count(ints, (i) -> i % 2 != 0));
        System.out.println("Elements greater than 3: " + count(ints, (i) -> i > 3));
    }

    static int count(Integer[] ints, Predicate<Integer> condition) {
        int count = 0;
        for (var i : ints) {
            if (condition.test(i)) {
                count++;
            }
        }
        return count;
    }

}
