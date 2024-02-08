package com.softserve.edu09.hw.hw1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class hw1 {
    public static void main(String[] args) {
        ArrayList<Integer> myCollection = genereteRandomsNumbers(10);
        System.out.println(myCollection);

        int max = Collections.max(myCollection);
        int min = Collections.min(myCollection);

        Collections.swap(myCollection,
                myCollection.indexOf(min),
                myCollection.indexOf(max));
        System.out.println(myCollection);

        Random rnd = new Random();

        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) < 0) {
                myCollection.add(i, rnd.nextInt(1000, 9999));
                break;
            }
        }
        System.out.println(myCollection);

        for (int i = 1; i < myCollection.size(); i++) {
            if (myCollection.get(i) != 0 &&
                    myCollection.get(i - 1) != 0 &&
                    Math.signum(myCollection.get(i)) != Math.signum(myCollection.get(i - 1))) {
                myCollection.add(i, 0);
                i++;
            }
        }
        System.out.println(myCollection);

        int k = 3;
        List<Integer> list1 = myCollection.subList(0, k);
        List<Integer> list2 = myCollection.subList(k, myCollection.size()).reversed();
        System.out.println(list1);
        System.out.println(list2);

        int s = myCollection.size() - 1;
        boolean fl = true;
        while (s != 0) {
            if (myCollection.get(s) != 0 && myCollection.get(s) % 2 == 0) {
                myCollection.remove(s);
                fl = false;
                break;
            }
            s--;
        }

        if (fl) {
            System.out.println("there are no even ones");
        } else {
            System.out.println(myCollection);
        }

        int min1 = Collections.min(myCollection);
        int indexMin = myCollection.indexOf(min1);

        if (indexMin != myCollection.size() - 1) {
            myCollection.remove(indexMin + 1);
        }
        System.out.println(myCollection);
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


