package com.softserve.edu14.pt.task1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("bla", "", "simp", "", "second", "third", "third", "sec", "blablabla");

        long countEmptyStrings = list.stream().filter(String::isEmpty).count();
        System.out.println("Number of empty strings: " + countEmptyStrings);

        list = list.stream().filter(str -> !str.isEmpty()).collect(Collectors.toList());
        System.out.println("List without empty strings: " + list);

        String result = list.stream().map(String::toUpperCase).collect(Collectors.joining(", "));
        System.out.println("Uppercase strings joined with coma: " + result);
    }
}
