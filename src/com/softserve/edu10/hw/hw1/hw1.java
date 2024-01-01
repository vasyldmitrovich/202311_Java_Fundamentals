package com.softserve.edu10.hw.hw1;

import java.util.HashSet;

public class hw1 {

    public static void main(String[] args) {

        HashSet<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(53);
        set1.add(19);
        System.out.println(set1);

        HashSet<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(6);
        set2.add(19);
        set2.add(8);
        set2.add(4);
        set2.add(43);
        set2.add(59);
        System.out.println(set2);

        System.out.println(union(set1, set2));

        System.out.println(intersect(set1, set2));
    }


    static HashSet intersect(HashSet<Integer> set1, HashSet<Integer> set2) {
        HashSet<Integer> result = new HashSet<>();
        for (int i : set2) {
            if (set1.contains(i)) {
                result.add(i);
            }
        }
        return result;
    }

    static HashSet union(HashSet<Integer> set1, HashSet<Integer> set2) {
        HashSet<Integer> result = new HashSet<>();
        result.addAll(set1);
        result.addAll(set2);
        return result;
    }
}
