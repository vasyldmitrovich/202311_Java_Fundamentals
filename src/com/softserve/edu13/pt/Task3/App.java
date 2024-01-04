package com.softserve.edu13.pt.Task3;

import java.util.*;

public class App {
    public static void main(String[] args) {

        List<String> nameList = (Arrays.asList("Lena","Petya","Jora","Vasya","stepan","Vova","Kolya"));

        nameList.sort(null);
        System.out.println(nameList);
        nameList.sort(String::compareToIgnoreCase);
        System.out.println(nameList);
        nameList.sort(Comparator.comparing(Objects::hashCode));
        nameList.forEach(System.out::println);

    }
}
