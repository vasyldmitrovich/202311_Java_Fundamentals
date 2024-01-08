package com.softserve.edu09.pt.practicalTask3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<Integer> myCollection = new ArrayList<>();
        var rnd = new Random(3);
        for (int i = 0; i < 10; i++) {
            myCollection.add(rnd.nextInt(0, 25));
        }
        System.out.println(myCollection);
        List<Integer> newCollection = new ArrayList<>();
        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) > 5) {
                newCollection.add(i);
            }
        }
        System.out.println(newCollection);
        var it = myCollection.iterator();
        while (it.hasNext()) {
            if (it.next() > 20) {
                it.remove();
            }
        }
        System.out.println(myCollection);
        myCollection.add(2, 1);
        myCollection.add(8, -3);
        myCollection.add(5, -4);
        for (int i = 0; i < myCollection.size(); i++) {
            System.out.println(i + " - " + myCollection.get(i));
        }
        myCollection.sort(null);
        System.out.println(myCollection);


    }
}
