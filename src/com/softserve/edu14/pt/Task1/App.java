package com.softserve.edu14.pt.Task1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("bla", "", "simp",
                "", "second", "third", "third", "sec","", "blablabla");

        var emptyStrings = list.stream().
                filter(String::isEmpty).
                count();
        List<String> removeEmptyStrings = list.stream().
                filter(item -> !item.isEmpty() ).
                toList();
        String itemsToUpperCase = list.stream().
                map(String::toUpperCase).collect(Collectors.joining(", "));


        System.out.println("Empty strings count = " + emptyStrings);
        System.out.println("Empty strings removed!\n" + removeEmptyStrings);
        System.out.println("Items to upper case :\n" + itemsToUpperCase);
    }
}
