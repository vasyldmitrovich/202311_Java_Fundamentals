package com.softserve.edu09.hw;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Homework1_T5 {
    public static void main(String[] args) {

        // Declare collection myCollection of 10 integers and fill it (from the console or random).
        List<Integer> myCollection = new ArrayList<>();
        var rnd = new Random();
        for (int i = 0; i < 10; i++) {
            myCollection.add(rnd.nextInt(-10, 10));
        }

        System.out.print("Original collection: ");
        System.out.println(myCollection);

        // In the list myCollection remove the last even element (if there are even elements in the list).
        // If there is no such element, display a message

        boolean thereIsEvenNum = false;
        for (int i = 0; i < myCollection.size(); i++) {
            if( myCollection.get(myCollection.size() - i - 1 ) % 2 == 0 ) {
                myCollection.remove(myCollection.size() - i - 1 );
                thereIsEvenNum = true;
                break;
            }
        }
        if( !thereIsEvenNum ) {
            System.out.println("There are no even numbers in myCollection.");
        }

        System.out.print("Collection after the removal of the last even number: ");
        System.out.println(myCollection);
    }
}
