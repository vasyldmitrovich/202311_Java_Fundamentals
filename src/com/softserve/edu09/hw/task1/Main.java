package com.softserve.edu09.hw.task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<Integer> myCollection = new ArrayList<>();
        Random random = new Random(1);
        for (int i = 0; i < 10; i++) {
            myCollection.add(random.nextInt(-10, 11));
        }

        System.out.println(myCollection);

        int maxIndex = myCollection.indexOf(Collections.max(myCollection));
        int minIndex = myCollection.indexOf(Collections.min(myCollection));
        Collections.swap(myCollection, maxIndex, minIndex);

        System.out.println(myCollection);

        int negativeIndex = -1;
        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) < 0) {
                negativeIndex = i;
                break;
            }
        }

        //System.out.println(negativeIndex);

        if (negativeIndex != -1) {
            myCollection.add(negativeIndex, random.nextInt(900) + 100);
        }

        System.out.println(myCollection);

        for (int i = 0; i < myCollection.size() - 1; i++) {
            if ((myCollection.get(i) > 0 && myCollection.get(i + 1) < 0) ||
                    (myCollection.get(i) < 0 && myCollection.get(i + 1) > 0)) {
                myCollection.add(i + 1, 0);
            }
        }

        System.out.println(myCollection);
    }
}
