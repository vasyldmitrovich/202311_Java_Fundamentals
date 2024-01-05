package com.softserve.edu09.pt.task3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<Integer> myCollection = new ArrayList<>();
        Random random = new Random(9);
        for (int i = 0; i < 10; i++) {
            myCollection.add(random.nextInt(1, 25));
        }
        System.out.println(myCollection);
        System.out.println("-------------------------------------------------------------------------");

        List<Integer> newCollection = new ArrayList<>();
        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) > 5) {
                newCollection.add(i);
            }
        }
        System.out.println(newCollection);
        System.out.println("-------------------------------------------------------------------------");

        var iterator = myCollection.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() > 20) {
                iterator.remove();
            }
        }
        System.out.println(myCollection);
        System.out.println("-------------------------------------------------------------------------");

        myCollection.add(2, 1);
        myCollection.add(8, -3);
        myCollection.add(5, -4);

        for (int i = 0; i < myCollection.size(); i++) {
            System.out.println("Position " + i + " = " + myCollection.get(i));;
        }

        myCollection.sort(null);
        System.out.println(myCollection);
    }
}
