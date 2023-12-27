package com.softserve.edu09.pt.task1;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

        ArrayList<HeavyBox> heavyBoxes = new ArrayList<>();
        heavyBoxes.add(new HeavyBox(5, "Content fifth box."));
        heavyBoxes.add(new HeavyBox(8, "Content eighth box."));
        heavyBoxes.add(new HeavyBox(3, "Content third box."));

        for (var hb : heavyBoxes) {
            System.out.println(hb);
        }

        System.out.println("================================================");

        heavyBoxes.get(0).setWeight(1);
        System.out.println(heavyBoxes.get(0));

        System.out.println("================================================");

        heavyBoxes.remove(heavyBoxes.size() - 1);
        for (var hb : heavyBoxes) {
            System.out.println(hb);
        }

        System.out.println("================================================");

        heavyBoxes.clear();
        System.out.println(heavyBoxes.isEmpty());
    }
}
