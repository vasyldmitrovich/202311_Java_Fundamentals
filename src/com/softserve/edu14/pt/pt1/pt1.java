package com.softserve.edu14.pt.pt1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class pt1 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("bla", "", "simp",
                "", "second", "third", "third", "sec", "blablabla");

        long countEmpty = list.stream()
                .filter(String::isEmpty)
                .count();
        System.out.println("There are " + countEmpty + " empty strings");

        var nonEmpty = list.stream()
                .filter(s -> !s.isEmpty())
                .toList();
        System.out.println(nonEmpty);

        var uppercaseList = list.stream()
                .map(String::toUpperCase)
                .collect(Collectors.joining(","));
        System.out.println(uppercaseList);
    }
}
