package com.softserve.edu09.hw;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Homework1_T4 {
    public static void main(String[] args) {

        // Declare collection myCollection of 10 integers and fill it (from the console or random).
        List<Integer> myCollection = new ArrayList<>();
        var rnd = new Random();
        for (int i = 0; i < 10; i++) {
            myCollection.add(rnd.nextInt(-10, 10));
        }

        System.out.print("Original collection: ");
        System.out.println(myCollection);

        // Copy the first k elements of the myCollection to the list1, in direct order, and the rest to the list2 in reverse order.
        int k = rnd.nextInt(1,6);  // randomly determine the number of elements to be included in list1 and in list2
        var list1 = myCollection.subList(0,k);
        List<Integer> list2 = new ArrayList<>();

        int counter = 0;
        for (int i = k; i < myCollection.size(); i++) {
            list2.add(counter, myCollection.get(myCollection.size() - ( counter + 1 )));
            counter++;
        }

        System.out.print("list1: ");
        System.out.println(list1);
        System.out.print("list2: ");
        System.out.println(list2);
    }
}
