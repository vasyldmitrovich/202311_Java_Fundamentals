package com.softserve.edu09.hw.homeTask1;

import java.util.*;

public class Main {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        List<Integer> myCollection = new ArrayList<>();
        fillRandom(myCollection);
        System.out.println("Collection: " + myCollection);

        //Swap the maximum and minimum elements in the list
        swapMaxAndMin(myCollection);
        System.out.println("Swapped min and max: " + myCollection);

        //Insert a random three-digit number before the first negative element of the list
        insertNumberBeforeFirstNegativeElement(myCollection);
        System.out.println("Inserted ree-digit number before the first negative element: " + myCollection);

        //Insert a zero between all neighboring elements collection myCollection with different signs
        insertZeroBetweenPlusAndMinus(myCollection);
        System.out.println("Inserted 0 between numbers with different signs: " + myCollection);

        //Copy the first k elements of the myCollection to the list1, in direct order, and the rest to the list2 in reverse order.
        System.out.print("Enter how many elements copy to list1: ");
        int k = Integer.parseInt(SCANNER.nextLine());
        List<Integer> list1 = List.copyOf(myCollection.subList(0, k));
        List<Integer> list2 = List.copyOf(myCollection.subList(k, myCollection.size())).reversed();
        System.out.println("List1: " + list1);
        System.out.println("List2: " + list2);

        //In a list myCollection remove the last even element (if there are even elements in the list). If there is no such element, display a message.
        try {
//            Collections.fill(myCollection,1);// - test for exception
            removeLastEvenElement(myCollection);
            System.out.println("Removed last even element: " + myCollection);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        //Remove from the list myCollection the element following the first minimum. If the minimum element is the last one, nothing needs to be removed.
        try {
            myCollection.set(myCollection.size() - 1, -1000); // waiting exception
            removeElementFollowingTheFirstMinimum(myCollection);
        } catch (IllegalArgumentException e) {
            System.out.println("Min element is last.");
        }
        System.out.println("Removed element following the first minimum: " + myCollection);


    }

    private static void removeElementFollowingTheFirstMinimum(List<Integer> myCollection) {
        int minIndex = findMin(myCollection);
        boolean isLast = (minIndex == myCollection.size() - 1);
        if (isLast){
            throw  new IllegalArgumentException();
        }
        if (!isLast) {
            myCollection.remove(minIndex + 1);
        }

    }

    private static void removeLastEvenElement(List<Integer> myCollection) {
        int lastEvenElementIndex = -1;

        for (int i = myCollection.size() - 1; i >= 0; i--) {
            if ((myCollection.get(i) != 0) && (myCollection.get(i) % 2 == 0)) {
                lastEvenElementIndex = i;
                break;
            }
        }
        if (lastEvenElementIndex == -1) {
            throw new IllegalArgumentException("There are no even numbers at myCollection.");
        }
        myCollection.remove(lastEvenElementIndex);
    }

    private static void insertZeroBetweenPlusAndMinus(List<Integer> myCollection) {
        for (int i = 0; i < myCollection.size() - 1; i++) {
            if ((myCollection.get(i) < 0) && (myCollection.get(i + 1) > 0)
                    || (myCollection.get(i) > 0) && (myCollection.get(i + 1) < 0)) {
                myCollection.add(i + 1, 0);
            }

        }
    }

    private static void insertNumberBeforeFirstNegativeElement(List<Integer> myCollection) {
        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) < 0) {
                myCollection.add(i, 666);
                break;
            }
        }
    }

    private static void swapMaxAndMin(List<Integer> myCollection) {
        int minNumberIndex = findMin(myCollection);
        int maxNumberIndex = findMax(myCollection);

        int temp = myCollection.get(minNumberIndex);
        myCollection.set(minNumberIndex, myCollection.get(maxNumberIndex));
        myCollection.set(maxNumberIndex, temp);

    }

    private static int findMax(List<Integer> myCollection) {
        int maxNumber = myCollection.getFirst();
        int maxNumberIndex = 0;
        for (int i = 1; i < myCollection.size(); i++) {
            if (myCollection.get(i) > maxNumber) {
                maxNumber = myCollection.get(i);
                maxNumberIndex = i;
            }
        }
        return maxNumberIndex;

    }

    private static int findMin(List<Integer> myCollection) {
        int minNumberIndex = 0;
        int minNumber = myCollection.getFirst();
        for (int i = 1; i < myCollection.size(); i++) {
            if (myCollection.get(i) < minNumber) {
                minNumber = myCollection.get(i);
                minNumberIndex = i;
            }
        }
        return minNumberIndex;
    }

    static void fillRandom(List<Integer> myCollection) {
        var rnd = new Random(100);
        for (int i = 0; i < 10; i++) {
            myCollection.add(rnd.nextInt(-100, 100));
        }
    }


}
