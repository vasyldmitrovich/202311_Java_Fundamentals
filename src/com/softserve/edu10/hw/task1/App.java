package com.softserve.edu10.hw.task1;

import java.util.HashSet;

public class App {
    public static void main(String[] args) {

        HashSet<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(3);
        set1.add(5);
        set1.add(7);

        HashSet<Integer> set2 = new HashSet<>();
        set2.add(2);
        set2.add(3);
        set2.add(6);
        set2.add(8);
        set2.add(10);

        for (var us : union(set1, set2)) {
            System.out.println(us);
        }
        System.out.println("=========================================");
        for (var us : intersect(set1, set2)) {
            System.out.println(us);
        }

    }

    public static HashSet<Integer> union(HashSet<Integer> set1, HashSet<Integer> set2) {
        HashSet<Integer> unionSet = new HashSet<>();
        for (var s1 : set1) {
            if (!unionSet.contains(s1)) {
                unionSet.add(s1);
            }
        }
        for (var s2 : set2) {
            if (!unionSet.contains(s2)) {
                unionSet.add(s2);
            }
        }
        return unionSet;
    }

    public static HashSet<Integer> intersect(HashSet<Integer> set1, HashSet<Integer> set2) {
        HashSet<Integer> intersecSet = new HashSet<>();
        for (var s1 : set1) {
            if (set2.contains(s1)) {
                intersecSet.add(s1);
            }
        }
        return intersecSet;
    }
}
