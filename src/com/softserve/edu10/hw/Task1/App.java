package com.softserve.edu10.hw.Task1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class App {
    public static void main(String[] args) {//Good
        Set<String> set1 = new HashSet<>();
        set1.add("Dog");
        set1.add("Cat");
        set1.add("Turtle");
        set1.add("Owl");

        Set<String> set2 = new HashSet<>();
        set2.add("Dog");
        set2.add("Kiwi");
        set2.add("Mango");
        set2.add("Turtle");
        intersect(set1,set2);
        union(set1,set2);


    }
    public static void print(Set<String> set){
        for (var item : set){
            System.out.print(item + " ");
        }
        System.out.println();

    }

    public static void intersect(Set<String> set1, Set<String> set2){
        Set<String> modifiedSet = new HashSet<>();

        for (var item : set1)
        {
            if (set1.contains(item) && set2.contains(item)){
                modifiedSet.add(item);
            }
        }
        System.out.println("Intersection:");
        print(modifiedSet);

    }
    public static void union(Set<String> set1, Set<String> set2){
        Set<String> modifiedSet = new HashSet<>(set1);
        modifiedSet.addAll(set2);
        System.out.println("Union:");
        print(modifiedSet);
    }
}
