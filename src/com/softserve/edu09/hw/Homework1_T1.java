package com.softserve.edu09.hw;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Homework1_T1 {
    public static void main(String[] args) {

        // Declare collection myCollection of 10 integers and fill it (from the console or random).
        List<Integer> myCollection = new ArrayList<>();
        var rnd = new Random();
        for (int i = 0; i < 10; i++) {
            myCollection.add(rnd.nextInt(-10, 10));
        }

        // Swap the maximum and minimum elements in the list.
        int minValue = myCollection.get(0);
        int minIndex = 0;
        int maxValue = myCollection.get(0);
        int maxIndex = 0;
        for (int i = 0; i < myCollection.size(); i++) {
            if( myCollection.get(i) < minValue ) {
                minValue = myCollection.get(i);
                minIndex = i;
            }
            if( myCollection.get(i) > maxValue ) {
                maxValue = myCollection.get(i);
                maxIndex = i;
            }
        }
        System.out.print("Original collection: ");
        System.out.println(myCollection);

        System.out.println("Min value is: " + minValue + ". It is located at index: " + minIndex + ".");
        System.out.println("Max value is: " + maxValue + ". It is located at index:  " + maxIndex + ".");

        myCollection.set( minIndex, maxValue );
        myCollection.set( maxIndex, minValue );

        System.out.print("Collection after the swap: ");
        System.out.println(myCollection);
    }
}
