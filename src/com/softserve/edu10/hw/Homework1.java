package com.softserve.edu10.hw;

import java.util.HashSet;
import java.util.Set;

public class Homework1 {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        set1.add("One");
        set1.add("Two");
        set1.add("Three");
        set1.add("Four");
        set1.add("Five");

        Set<String> set2 = new HashSet<>();
        set2.add("Ein");
        set2.add("One");
        set2.add("Zwei");
        set2.add("Two");
        set2.add("Drei");
        set2.add("Vier");

        union(set1, set2);
        System.out.println();
        intersect(set1, set2);
    }

    static void union( Set<String> set1, Set<String> set2 ) {
        Set<String> unionSet = new HashSet<>(set1);
        unionSet.addAll(set2);
        System.out.println("Unified set: ");
        for( var entry: unionSet ) {
            System.out.println(entry);
        }
    }

    static void intersect( Set<String> set1, Set<String> set2 ) {
        Set<String> intersectSet = new HashSet<>();

        for( var entry: set1 ) {
            if( set1.contains(entry) && set2.contains(entry) ) {
                intersectSet.add(entry);
            }
        }
        System.out.println("Intersect method: ");
        for( var entry: intersectSet ) {
            System.out.println(entry);
        }
    }
}
