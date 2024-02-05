package com.softserve.edu10.hw.homeTask01;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        printSet(set1);
        Set<Integer> set2 = new HashSet<>(Arrays.asList(6, 7, 8, 9, 10, 11, 12, 13, 14, 15));
        printSet(set2);
        System.out.println("Union " + union(set1, set2));
        System.out.println("intersect " + intersect(set1, set2));

    }


        public static <T> Set<T> union(Set<T> set1, Set<T> set2) {
            Set<T> result = new HashSet<>(set1);
            result.addAll(set2);
            return result;
        }

    public static <T> Set<T> intersect(Set<T> set1, Set<T> set2) {
        Set<T> result = new HashSet<>(set1);
        result.retainAll(set2);
        return result;
    }


    static void printSet(Set set) {
        System.out.print("[ ");
        for (var setElement : set) {
            System.out.print(setElement + " ");
        }
        System.out.println("]");
    }

}