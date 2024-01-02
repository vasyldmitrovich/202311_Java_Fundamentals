package com.softserve.edu09.hw.task1;

import java.util.*;

public class App {
    public static void main(String[] args) {
        List<Integer> myCollection = new ArrayList<>();
        Random rand = new Random();
        for(int i = 0; i < 10; i++){
            myCollection.add(rand.nextInt(-10,20));
        }
        System.out.println(myCollection);
        swapMinMax(myCollection);
        addRandomBeforeFirstNegative(myCollection);
        addZeroBetween(myCollection);
        split(myCollection);
        remuveLastEven(myCollection);
        delFirstAfterMin(myCollection);
    }

    public static void swapMinMax(List<Integer> myCollection){
        int minNum = 30;
        int maxNum = 0;
        int indMin = 0;
        int indMax = 0;

        for (int mc:myCollection) {
            if (mc < minNum) {
                minNum = mc;
                indMin = myCollection.indexOf(mc);
            }
            if (mc > maxNum) {
                maxNum = mc;
                indMax = myCollection.indexOf(mc);
            }
        }
        System.out.println(minNum);
        System.out.println(maxNum);
        System.out.println("==========================================");

        Collections.swap(myCollection, indMin, indMax);
        System.out.println(myCollection);
    }

    public static void addRandomBeforeFirstNegative(List<Integer> myCollection) {//Good
        Random rand = new Random();

        for (int mc:myCollection) {
            if (mc < 0) {
                myCollection.add(myCollection.indexOf(mc), rand.nextInt(100,999));
                break;
            }
        }
        System.out.println(myCollection);
    }

    public static void addZeroBetween(List<Integer> myCollection) {
        List<Integer> newList = new ArrayList<>();
        for (int i=0; i < myCollection.size(); i++){
            newList.add(myCollection.get(i));
            if (i == myCollection.size() - 1){
                continue;
            }
            if ((myCollection.get(i) >= 0 && myCollection.get(i+1) < 0)
            || (myCollection.get(i) <= 0 && myCollection.get(i+1) > 0)){
                newList.add(0);
            }
        }

        myCollection = newList;
        System.out.println(myCollection);

    }

    public static void split(List<Integer> myCollection){

        List<Integer> list1 = myCollection.subList(0,5);
        List<Integer> list2 = myCollection.subList(5, myCollection.size());
        Collections.reverse(list2);

        System.out.println(list1);
        System.out.println(list2);
    }

    public static void remuveLastEven(List<Integer> myCollection) {//Maybe name method should have named removeLastEvent
        int curEven = -1;
        for (var el:myCollection){
            if (el%2 == 0) {
                curEven = el;
            }
        }
        if (curEven != -1){
            myCollection.remove(myCollection.indexOf(curEven));
            System.out.println(myCollection);
        }
        else {
            System.out.println("Collection doesn't have even numbers");
            System.out.println(myCollection);
        }
    }

    public static void delFirstAfterMin(List<Integer> myCollection) {
        int minNum = Collections.min(myCollection);
        System.out.println(minNum);
        if (myCollection.indexOf(minNum) < myCollection.size() - 1){
            myCollection.remove(myCollection.indexOf(minNum) + 1);
        }
        System.out.println(myCollection);
    }
}
