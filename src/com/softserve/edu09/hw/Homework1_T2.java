package com.softserve.edu09.hw;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Homework1_T2 {
    public static void main(String[] args) {

        // Declare collection myCollection of 10 integers and fill it (from the console or random).
        List<Integer> myCollection = new ArrayList<>();
        var rnd = new Random();
        for (int i = 0; i < 10; i++) {
            myCollection.add(rnd.nextInt(-10, 10));
        }

        System.out.print("Original collection: ");
        System.out.println(myCollection);

        // Insert a random three-digit number before the first negative element of the list
        int rndNum = rnd.nextInt(100, 999);
        for (int i = 0; i < myCollection.size(); i++) {
            if( myCollection.get(i) < 0 ) {
                myCollection.add(i, rndNum);
                break;
            }
        }

        System.out.print("Collection after the insertion: ");
        System.out.println(myCollection);
    }
}
