package com.softserve.edu13.pt.pt1;

import java.sql.Array;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.MonthDay;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;

public class pt1 {
    public static void main(String[] args) {
        System.out.println(LocalDate.now().getDayOfWeek());
        System.out.println(LocalDate.now().with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY)));

        List<String> list = new ArrayList<>();
        list.add("Bob");
        list.add("Alex");
        list.add("alice");
        list.add("Lee");
        list.add("John");
        System.out.println(list);
        list.sort(String::compareToIgnoreCase);
        System.out.println(list);
        Integer[] arr = {4, 5, 6, 3, 8, 8, 3, 3, 5,11};
        System.out.println("Total:" + count(arr, i -> true));
        System.out.println("Even:" + count(arr, i -> i % 2 == 0));
        System.out.println("Odd:" + count(arr, i -> i % 2 != 0));
        System.out.println(">3:" + count(arr, i -> i > 3));

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
