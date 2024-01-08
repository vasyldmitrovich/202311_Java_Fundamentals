package com.softserve.edu14.pt;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {

        //task1
        List<String> list = Arrays.asList("bla", "", "simp",
                "", "second", "third", "third", "sec", "blablabla");
        System.out.println(list.stream().filter(String::isEmpty).count());
        System.out.println("====================================================");
        List<String> rezultList = list.stream().filter(t -> !t.isEmpty()).toList();
        System.out.println(rezultList);
        System.out.println("====================================================");
        String stringUpperCase = rezultList.stream().map(t -> t.toUpperCase()).collect(Collectors.joining(","));
        System.out.println(stringUpperCase);

        System.out.println("=========================================================================");
        System.out.println("=========================================================================");

        //task2
        List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
        System.out.println(primes.stream().count());
        System.out.println(primes.stream().min(Integer::compareTo).get());
        System.out.println(primes.stream().max(Integer::compareTo).get());
        System.out.println(primes.stream().mapToInt((t) -> t).summaryStatistics().getSum());


    }
}
