package com.softserve.edu09.hw.task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        List<Integer> myCollection = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            myCollection.add(new Random().nextInt(100));
        }

        System.out.println(myCollection);

        int max = Collections.max(myCollection);
        int min = Collections.min(myCollection);
        Collections.swap(myCollection, myCollection.indexOf(max), myCollection.indexOf(min));

        System.out.println(myCollection);

        int index = myCollection.indexOf(-1);
        if (index != -1) {
            int randomNumber = new Random().nextInt(1000) + 1000;
            myCollection.add(index, randomNumber);
        }

        System.out.println(myCollection);

        for (int i = 0; i < myCollection.size() - 1; i++) {
            if (myCollection.get(i) * myCollection.get(i + 1) < 0) {
                myCollection.add(i + 1, 0);
            }
        }

        int k = 5;
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < myCollection.size(); i++) {
            if (i < k) {
                list1.add(myCollection.get(i));
            } else {
                list2.add(myCollection.get(myCollection.size() - 1 - i));
            }
        }

        int lastEvenIndex = myCollection.lastIndexOf(2);
        if (lastEvenIndex != -1) {
            myCollection.remove(lastEvenIndex);
        } else {
            System.out.println("There are no paired items in the list");
        }

        int minIndex = Collections.min(myCollection);
        if (minIndex + 1 < myCollection.size()) {
            myCollection.remove(minIndex + 1);
        }

        System.out.println("myCollection = " + myCollection);
        System.out.println("list1 = " + list1);
        System.out.println("list2 = " + list2);
    }
}