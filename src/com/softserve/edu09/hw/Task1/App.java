package com.softserve.edu09.hw.Task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class App implements Cloneable {
    public static void main(String[] args)  {
        List<Integer> myCollection = new ArrayList<>();


        fillCollection(myCollection);
        System.out.println("My collection:");
        print(myCollection);
        swapMinMax(myCollection);
        addThreeDigitNumber(myCollection);
        addZeroBetweenDifferentSigns(myCollection);
        manipulateKElements(myCollection);
        deleteLastEvenElement(myCollection);
        deleteElementNextToMinimum(myCollection);

    }
    public static List fillCollection  (List<Integer> myCollection){
        Random random = new Random();
        int randomNumber;

        for (int i = 0; i < 10; i++){
            randomNumber = random.nextInt(201)-100;
            myCollection.add(randomNumber);
        }
        return myCollection;
    }

    public static void delimiter(){
        System.out.println("=====================");
    }
    public static int getRandomNumber (){

        Random random = new Random();
        return random.nextInt(900) + 100;

    }
    public static void print(List<Integer> inputList){

        if(inputList.isEmpty()){
            System.out.println("Collection is empty!");
        } else {

            for (var element : inputList){
                System.out.print(element + " ");
            }
            System.out.println();
        }

    }

    public static void swapMinMax (List<Integer> inputList){

        int maxValue = inputList.get(0);
        int minValue = inputList.get(0);
        int maxElementPosition = 0;
        int minElementPosition = 0;
        delimiter();

        System.out.println("Swap minimum and maximum.");
        System.out.println("Collection before swap :");
        print(inputList);

        for(int i = 1; i < inputList.size(); i++){
            if(maxValue > inputList.get(i)){
                maxValue = inputList.get(i);
                maxElementPosition = i;
            }
            if(minValue < inputList.get(i)){
                minValue = inputList.get(i);
                minElementPosition = i;
            }

        }
        System.out.printf("Min element = %d found at position %d.\n",minValue,minElementPosition);
        System.out.printf("Max element = %d found at position %d.\n",maxValue,maxElementPosition);
        inputList.set(minElementPosition,maxValue);
        inputList.set(maxElementPosition,minValue);

        System.out.println("List after swap :");
        print(inputList);
        delimiter();

    }

    public static void addThreeDigitNumber(List<Integer> inputList){

        List<Integer> newCollection = new ArrayList<>();
        int randomNumber = getRandomNumber();
        int position = 0;
        delimiter();

        for(var element : inputList){
            newCollection.add(element);
            if(element < 0){
                newCollection.add(position + 1,randomNumber);
                break;
            }
            position ++;
        }
        for(int i = position + 1; i < inputList.size(); i++){
            newCollection.add(inputList.get(i));
        }

        System.out.println("Add random three digit number after first negative!");

        print(newCollection);
        delimiter();
    }


    public static void addZeroBetweenDifferentSigns(List<Integer> inputList){

        List<Integer> modifiedList = new ArrayList<>();
        delimiter();
        System.out.println("Add zero between numbers with different signs.");

        for (int i = 0; i < inputList.size();i++){
            modifiedList.add(inputList.get(i));

            if(i < inputList.size() - 1){
                if ((inputList.get(i) >= 0 && inputList.get(i + 1) < 0)||
                        (inputList.get(i) < 0 && inputList.get(i + 1) >= 0)){
                    modifiedList.add(0);
                }
            }
        }
        print(modifiedList);
        delimiter();
    }

    public static void manipulateKElements (List<Integer> myCollection){

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        Random randomNumber = new Random();
        int k = randomNumber.nextInt(10);//Generating random k - number in range from 0 to 10

        delimiter();
        System.out.println("Copy first k elements in direct order to list 1 , \nand the rest in reversed order to list 2.");
        System.out.println("My collection: ");
        print(myCollection);
        System.out.println("\"k\" number = " + k + ".");

        for (int i = 0; i < k ; i++){
            list1.add(myCollection.get(i));
        }
        for (int i = myCollection.size() - 1; i > k - 1; i--){
            list2.add(myCollection.get(i));
        }

        System.out.println("List 1 :");
        print(list1);
        System.out.println("List 2: ");
        print(list2);
        delimiter();
    }

    public static void deleteLastEvenElement(List<Integer> inputList){

        List<Integer> modifiedList = new ArrayList<>();
        boolean firsEvenFound = false;
        delimiter();
        System.out.println("Remove the last even element from collection.");
        System.out.println("My collection :");
        print(inputList);

        for (var element : inputList.reversed()){

            if(!firsEvenFound){
                if(element % 2 == 0){
                firsEvenFound = true;
                System.out.printf("Last even element = %d\n",element);
                continue;
                }
            }
            modifiedList.add(element);
        }
        if(!firsEvenFound){
            System.out.println("Even elements not found!");
        }

        print(modifiedList.reversed());
        delimiter();

        }

        public static void deleteElementNextToMinimum(List<Integer> inputList){

            List<Integer> modifiedList = new ArrayList<>();
            int minimum = inputList.get(0);
            int position = 0;
            delimiter();
            System.out.println("Remove from the list myCollection the element following the first minimum. \nIf the minimum" +
                    "element is the last one, nothing needs to be removed.");
            System.out.println("myCollection:");
            print(inputList);

            for (var element : inputList){
                modifiedList.add(element);
                if(element < minimum){
                    minimum = element;
                    position = inputList.indexOf(element);
                }
            }
            System.out.println("Minimum element = " + minimum + ".");

            if(position != modifiedList.size()){
                System.out.printf("Element to remove = %d.\n",modifiedList.get(position + 1));
                modifiedList.remove(position + 1);
            } else {
                System.out.printf("%d is the last element.\n", minimum);
            }
            System.out.println("After modifications :");
            print(modifiedList);
            delimiter();
        }

    }

