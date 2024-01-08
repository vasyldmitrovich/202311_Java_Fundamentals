package com.softserve.edu09.pt.praticalTask1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<HeavyBox> arr = new ArrayList<>();
        arr.add(new HeavyBox(5, "Table"));
        arr.add(new HeavyBox(1, "Lamp"));
        arr.add(new HeavyBox(2, "Chair"));
        arr.add(new HeavyBox(3, "Armchair"));

        for (var el : arr) {
            System.out.println(el);
        }
        System.out.println("===============");
        var first = arr.get(0);
        first.setWeight(first.getWeight() + 1);
        for (var el : arr) {
            System.out.println(el);
        }
        System.out.println("===============");
        arr.remove(arr.size() - 1);
        for (var el : arr) {
            System.out.println(el);
        }
        System.out.println("===============");
        arr.clear();
        for (var el : arr) {
            System.out.println(el);
        }
        System.out.println("===============");

    }
}
