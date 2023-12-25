package com.softserve.edu09.pt.task3;

import java.util.*;

public class Add {
    public static void main(String[] args) {
        ArrayList <Integer> myCollection = new ArrayList<>();
        ArrayList <Integer> newCollection = new ArrayList<>();
        Random rand = new Random();
        for (int i=0; i < 10; i++) {
            myCollection.add(rand.nextInt(1,25));
        }
        System.out.println(myCollection);
        for (var my:myCollection) {
            if (my > 5){
                newCollection.add(my);
            }
        }
        System.out.println(newCollection);

        Iterator<Integer> myIterator = myCollection.iterator();
        while (myIterator.hasNext()){
            int nextMy = myIterator.next();
            if (nextMy > 20) {myIterator.remove();}
        }
        System.out.println(myCollection);
        myCollection.add(2,1);
        myCollection.add(5,-3);
        myCollection.add(8,-4);
        System.out.println(myCollection);
        Collections.sort(myCollection, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });

        System.out.println(myCollection);
    }

}
