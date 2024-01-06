package com.softserve.edu14.hw.homeTask2;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream<Emploee> emploeeList1 = Stream.empty();
        System.out.println(Emploee.mostPopularName(emploeeList1));

        Stream<Emploee> emploeeList2 = Stream.of(
                new Emploee("Bob"),
                new Emploee("Din"),
                new Emploee("Sam"),
                new Emploee("Sam")
        );
        System.out.println(Emploee.mostPopularName(emploeeList2));




    }
}
