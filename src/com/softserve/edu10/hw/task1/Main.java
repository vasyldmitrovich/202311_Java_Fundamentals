package com.softserve.edu10.hw.task1;

import java.util.HashSet;
import java.util.Set;

public class Main {

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

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        Set<Integer> set2 = new HashSet<>();
        set2.add(2);
        set2.add(3);
        set2.add(4);

        Set<Integer> unionResult = union(set1, set2);
        System.out.println("Union result: " + unionResult);

        Set<Integer> intersectResult = intersect(set1, set2);
        System.out.println("Intersection result: " + intersectResult);
    }
}

