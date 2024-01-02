package com.softserve.edu09.hw;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Homework1_T3 {
    public static void main(String[] args) {
        // Declare collection myCollection of 10 integers and fill it (from the console or random).
        List<Integer> myCollection = new ArrayList<>();
        var rnd = new Random();
        for (int i = 0; i < 10; i++) {
            myCollection.add(rnd.nextInt(-10, 10));
        }

        System.out.print("Original collection: ");
        System.out.println(myCollection);

        // Insert a zero between all neighboring elements collection myCollection with different signs

        // calculate how many instances of +/- combinations there are in the list.
        // Counter is the variable that counts such combinations
        //Move this logic to some method and call this method here
        int counter = 0;
        for (int i = 1; i < myCollection.size(); i++) {
            if( myCollection.get(i-1) < 0 && myCollection.get(i) >= 0 ) {
                counter++;
            }
            if( myCollection.get(i-1) >=0 && myCollection.get(i) < 0 ) {
                counter++;
            }
        }

        int listSize = myCollection.size();  // need to fix the size of the list before adding additional elements there
        for (int i = 1; i < listSize + counter; i++) {
            if( myCollection.get(i-1) < 0 && myCollection.get(i) >= 0 ) {
                myCollection.add(i, 0);
                i++;
            }
            if( myCollection.get(i-1) >=0 && myCollection.get(i) < 0 ) {
                myCollection.add(i, 0);
                i++;
            }
        }

        System.out.print("Collection after the insertion: ");
        System.out.println(myCollection);
    }
}
