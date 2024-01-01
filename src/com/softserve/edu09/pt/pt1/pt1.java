package com.softserve.edu09.pt.pt1;

import java.util.ArrayList;

public class pt1 {
    public static void main(String[] args) {
        ArrayList<HeavyBox> arrHeavyBoxs = new ArrayList<>();
        arrHeavyBoxs.add(new HeavyBox(10, "box1"));
        arrHeavyBoxs.add(new HeavyBox(2, "box2"));
        arrHeavyBoxs.add(new HeavyBox(3, "box3"));
        arrHeavyBoxs.add(new HeavyBox(7, "box4"));

        printArr(arrHeavyBoxs);

        arrHeavyBoxs.get(0).setWeight(1);
        arrHeavyBoxs.removeLast();
        printArr(arrHeavyBoxs);

       /* while (arrHeavyBoxs.size() > 0) {
            arrHeavyBoxs.removeLast();
        }*/
        arrHeavyBoxs.clear();
        printArr(arrHeavyBoxs);

    }

    static void printArr(ArrayList arr) {
        System.out.println("___");
        if (arr.size() == 0) {
            System.out.println("empty array");
        } else {
            for (Object a : arr) {
                System.out.println(a);
            }
        }
    }
}

