package com.softserve.edu09.pt.Task3;


import java.util.*;

public class App    {
    public static void main(String[] args)  {
        List<Integer> myCollection = new ArrayList<>();
        List<Integer> newCollection = new ArrayList<>();
        //Nice
        fillCollection(myCollection);//Fill list with random numbers
        System.out.println("Collection:");
        print(myCollection);
        newCollection = positionsMoreThan5(myCollection);
        print(newCollection);

        removePositionsMoreThan20(myCollection);

        setElementsToPositions(myCollection);

        myCollection.sort(Integer::compareTo);
        System.out.println("Sorted final collection");//Good
        print(myCollection);

    }

    public static void print(List<Integer> collection){

        if(collection.isEmpty()){
            System.out.println("Collection is empty!");
        } else {

            for (var element : collection){
                System.out.print(element + " ");
            }
            System.out.println();
        }

    }

    public static List fillCollection (List<Integer> collection){
        Random random = new Random();
        int randomNumber;

        for (int i = 0; i < 10; i++){
            randomNumber = random.nextInt(50);
            collection.add(randomNumber);
        }
        return collection;
    }

    public static List positionsMoreThan5(List<Integer> myCollection){

        System.out.println("Positions of elements more then 5");
        List<Integer> newCollection = new ArrayList<>();
        int position = 0;
        for (var element : myCollection){
            if(element >= 6){
                newCollection.add(position);
            }
            position++;
        }
        return newCollection;
    }
    public static void removePositionsMoreThan20(List<Integer> myCollection){

        System.out.println("Elements more then 20 removed");
        List<Integer> newCollection = new ArrayList<>();

        for (var element : myCollection){
            if(element <= 20){
                newCollection.add(element);
            }
        }
       print( newCollection);
    }

    public static void formattedPrint (List<Integer> myCollection){

        int position = 0;
        for (var element : myCollection)
        {
            System.out.print("position - " + position + " ");
            System.out.println("value - " + element);
            position++;
        }
    }

    public static void setElementsToPositions (List<Integer> myCollection){

        System.out.println("Added elements 1,-3,-4 in positions 2, 8, 5.");
        myCollection.set(2,1);
        myCollection.set(5,-4);
        myCollection.set(8,-3);
        formattedPrint(myCollection);
        print(myCollection);
    }

}
