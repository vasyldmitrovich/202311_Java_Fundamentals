package com.softserve.edu09.pt.Task2;

import java.util.*;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        List<Integer> numbersList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter numbers string");
        String input = scanner.nextLine();

        numbersList = Arrays.asList(input.split("\\s*,\\s*")).
                stream().
                map(Integer::parseInt).
                collect(Collectors.toList());

        HashSet<Integer> listWithoutDuplicates = new HashSet<>(numbersList);
        System.out.println("Original");
        System.out.println(numbersList);
        System.out.println("Without duplicates");
        System.out.println(listWithoutDuplicates);



    }

}
