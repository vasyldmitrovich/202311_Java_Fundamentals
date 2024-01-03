package com.softserve.edu10.hw;

import java.util.*;

public class Homework2 {
    public static final Scanner SCANNER = new Scanner( System.in );

    public static void main(String[] args) {
        Map<String, String> personMap = new HashMap<>();

        personMap.put("One", "Ein");
        personMap.put("Two", "Zwei");
        personMap.put("Three", "Drei");
        personMap.put("Four", "Vier");
        personMap.put("Five", "Fünf");
        personMap.put("Six", "Sechs");
        personMap.put("Seven", "Sieben");
        personMap.put("Eight", "Acht");
        personMap.put("Nine", "Neun");
        personMap.put("Ten", "Zen");
        personMap.put("Eleven", "Ein");

        System.out.println("Original list of names: ");
        printMap(personMap);

        checkingForNameEquality(personMap);

        removePersonByName(personMap);

        System.out.println("\nList of names after the removal of the specified name: ");
        printMap(personMap);
    }

    static void printMap( Map<String, String> map ) {
        for( var entry : map.entrySet() ) {
            System.out.println("Person " + entry.getKey() + " has name " + entry.getValue() );
        }
    }

    static void checkingForNameEquality( Map<String, String> map ) {

        Set<String> uniqueValues = new HashSet<>(map.values());

        System.out.println(); // formatting line

        if( uniqueValues.size() < map.size() ) {
            System.out.println("There are two or more persons with the same name in the group.");
        } else {
            System.out.println("There are no people with identical names in the group.");
        }
    }

    static void removePersonByName ( Map<String, String> map ) {
        System.out.println(); // formatting line

        System.out.print("User, please enter the name of the person you want to delete: ");
        String name = SCANNER.nextLine();
        //SCANNER.nextLine();

        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        String keyName = null;

        while(iterator.hasNext() ) {
            Map.Entry<String, String> entry = iterator.next();
            String nameValue = (String) entry.getValue();
            if(name.equals( nameValue )) {
                keyName = (String) entry.getKey();
                break;
            }
        }
        if( keyName != null ) {
            map.remove(keyName);
        }
    }
}
