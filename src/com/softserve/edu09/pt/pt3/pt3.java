package com.softserve.edu09.pt.pt3;

import java.util.*;

public class pt3 {
    public static void main(String[] args) {
        ArrayList<Integer> myCollection = genereteRandomsNumbers(10);

        System.out.println(myCollection);
        List<Integer> newCollection = new ArrayList<>();

        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) > 5) {
                newCollection.add(i);
            }
        }
        System.out.println(newCollection);

        ArrayList<Integer> myCollection1 = new ArrayList<>();
        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) > 20) {
                myCollection1.add(myCollection.get(i));
            }
        }
        myCollection.removeAll(myCollection1);
        System.out.println(myCollection);

        ArrayList<Integer> myCollection3 = genereteRandomsNumbers(10);
        /*myCollection3.add(2,1);
        myCollection3.add(8,-3);
        myCollection3.add(5,-4);*/

        myCollection3.set(2, 1);
        myCollection3.set(8, -3);
        myCollection3.set(5, -4);

        for (int i = 0; i < myCollection3.size(); i++) {
            System.out.println("position:" + i + " value of element " + myCollection3.get(i));
        }

        Collections.sort(myCollection3);
        System.out.println(myCollection3);


    }

    static ArrayList<Integer> genereteRandomsNumbers(int quntity) {
        Random rnd = new Random();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < quntity; i++) {
            arr.add(rnd.nextInt(-100, 100));
        }
        return arr;
    }
}
