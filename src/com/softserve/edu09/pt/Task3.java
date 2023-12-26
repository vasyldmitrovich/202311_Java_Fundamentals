package com.softserve.edu09.pt;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Task3 {
    public static final Scanner SCANNER = new Scanner( System.in );

    public static void main(String[] args) {
        List<Integer> myCollection = new ArrayList<>();
        var num = new Random(42);

        for (int i = 0; i < 10; i++) {
            myCollection.add(num.nextInt(0,10));
        }

        System.out.println(myCollection);

        List<Integer> newCollection = new ArrayList<>();
        for (int i = 0; i < myCollection.size(); i++) {
            if( myCollection.get(i) > 5 ) {
                newCollection.add(i);
            }
        }
        System.out.println(newCollection);

        // Remove from collection myCollection elements, which are greater than 20. Output the result
        var it = myCollection.iterator();
        while(it.hasNext()) {
            if( it.next() > 5 ) {
                it.remove();
            }
        }

        // Insert elements 1, -3, -4 in positions 2, 8, 5. Output the result in the format: “position – xxx, value of element – xxx”
        myCollection.add(2, 1);
        myCollection.add(8, -3);
        myCollection.add(5, -4);
        for (int i = 0; i < myCollection.size(); i++) {
            System.out.println("Position - " + i +
                    ", value of the element - " + myCollection.get(i));
        }

        // Sort and print collection
        System.out.println();
        myCollection.sort(null);
        System.out.println(myCollection);

    }
}
