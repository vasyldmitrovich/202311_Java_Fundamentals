package com.softserve.edu13.pt;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;

public class App {
    public static void main(String[] args) {
        //task1
        DayOfWeek today = LocalDateTime.now().getDayOfWeek();
        System.out.println(today);
        System.out.println("=================================");
        //task2
        LocalDate currentMonth = LocalDate.now();
        TemporalAdjuster firstMonInMonth = TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY);
        System.out.println(currentMonth.with(firstMonInMonth));
        System.out.println("=================================");
        //task3
        List<String> strings = new ArrayList<>();
        strings.add("Olena");
        strings.add("Bob");
        strings.add("Antony");
        strings.add("Tom");
        strings.add("George");
        strings.sort(String::compareTo);
        for (var s : strings) {
            System.out.println(s);
        }
        System.out.println("=================================");
        //task3
        Integer[] numbers = new Integer[10];
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            numbers[i] = rand.nextInt(1, 20);
        }
        for (var n : numbers) {
            System.out.println(n);
        }
        System.out.println("Total count = " + count(numbers, i -> true));
        System.out.println("Count even numbers: " + count(numbers, i -> i % 2 == 0));
        System.out.println("Count odd numbers: " + count(numbers, i -> i % 2 != 0));
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
