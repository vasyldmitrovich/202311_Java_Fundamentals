package com.softserve.edu09.pt.task1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<HeavyBox> arr = new ArrayList<>();
        arr.add(new HeavyBox(7, "Cat"));
        arr.add(new HeavyBox(44, "Dog"));
        arr.add(new HeavyBox(2, "Eagle"));

        for (var box : arr) {
            System.out.println(box);
        }

        System.out.println("----------------------------------------");
        var changeBox = arr.get(0);
        changeBox.setWeight(changeBox.getWeight() + 1);
        for (var box : arr) {
            System.out.println(box);
        }

        System.out.println("----------------------------------------");
        arr.remove(arr.size() - 1);
        for (var box : arr) {
            System.out.println(box);
        }

        System.out.println("----------------------------------------");
        arr.clear();
        for (var box : arr) {
            System.out.println(box);

        }
        System.out.println(arr);
    }
}