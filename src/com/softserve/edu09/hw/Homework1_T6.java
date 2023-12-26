package com.softserve.edu09.hw;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Homework1_T6 {
    public static void main(String[] args) {

        // Declare collection myCollection of 10 integers and fill it (from the console or random).
        List<Integer> myCollection = new ArrayList<>();
        var rnd = new Random();
        for (int i = 0; i < 10; i++) {
            myCollection.add(rnd.nextInt(-10, 10));
        }

        System.out.println(myCollection);

        // Remove from the list myCollection the element following the first minimum.
        // If the minimum element is the last one, nothing needs to be removed.

        int minValue = myCollection.get(0);
        int minIndex = 0;

        for (int i = 1; i < myCollection.size(); i++) {
            if( myCollection.get(i) < minValue ) {
                minValue = myCollection.get(i);
                minIndex = i;
            }
        }

        if( minIndex < myCollection.size() - 1 ) {
            myCollection.remove(minIndex + 1 );
        }

        System.out.println(myCollection);
    }
}
