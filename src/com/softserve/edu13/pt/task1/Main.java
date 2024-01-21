package com.softserve.edu13.pt.task1;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        DayOfWeek today = LocalDate.now().getDayOfWeek();
        System.out.println("Today: " + today);

        LocalDate firstMonday = LocalDate.now().withDayOfMonth(1);
        while (firstMonday.getDayOfWeek() != DayOfWeek.MONDAY) {
            firstMonday = firstMonday.plusDays(1);
        }
        System.out.println("Date of the first Monday of the current month: " + firstMonday);

        List<String> stringList = Arrays.asList("banana", "apple", "orange", "grape", "kiwi");
        stringList.sort(String::compareToIgnoreCase);
        System.out.println("Sorted list: " + stringList);

        Integer[] integerArray = {1, 5, 8, 12, 3, 6, 9, 15, 7, 10};
        int countResult = count(integerArray, x -> x % 2 == 0);
        System.out.println("Number of elements satisfying the condition: " + countResult);
    }

    public static int count(Integer[] array, IntCondition condition) {
        int count = 0;
        for (int num : array) {
            if (condition.test(num)) {
                count++;
            }
        }
        return count;
    }

    interface IntCondition {
        boolean test(int num);
    }
}