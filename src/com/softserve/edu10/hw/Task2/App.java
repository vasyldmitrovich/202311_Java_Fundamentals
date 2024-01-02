package com.softserve.edu10.hw.Task2;

import java.util.*;

public class App {
    public static void main(String[] args) {//Ok

        Map <String,String> personMap = new LinkedHashMap<>();

        personMap.put("Luniov","Artem");
        personMap.put("Lebedev","Martin");
        personMap.put("Shevchenko","Alexandra");
        personMap.put("Levaya","Marina");
        personMap.put("Marunevich","Alexandra");
        personMap.put("Borov","Sergei");
        personMap.put("Pitica","Petrea");
        personMap.put("Ivanov","Orest");
        personMap.put("Slavov","Ignat");
        personMap.put("Kozimova","Riana");
        delimiter();
        print(personMap);
        checkDuplicates(personMap);
        delimiter();
        System.out.println("At least two persons with the same first name: " + checkDuplicates(personMap));
        delimiter();
        removeSpecifiedName(personMap,"Orest");
        System.out.println("After removing specify name: ");
        print(personMap);



    }
    public static boolean checkDuplicates(Map<String,String> map){
        Map<String, Integer> firstNameCountMap = new HashMap<>();

        for (String firstName : map.values()) {
            firstNameCountMap.put(firstName, firstNameCountMap.getOrDefault(firstName, 0) + 1);
        }

        return firstNameCountMap.values().stream().anyMatch(count -> count >= 2);
    }

    public static void removeSpecifiedName(Map<String,String> map, String specifiedName){
        map.entrySet().removeIf(entry->entry.getValue().equals(specifiedName));
    }

    public static void delimiter(){
        System.out.println("============");
    }


    public static void print(Map<String,String> map){
        for (var person : map.entrySet()){
            System.out.println(person.getKey() + " " + person.getValue());
        }
    }
}
