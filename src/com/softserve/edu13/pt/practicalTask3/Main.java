package com.softserve.edu13.pt.practicalTask3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list= new ArrayList<>();
        list.add("Alice");
        list.add("Bob");
        list.add("John");
        list.add("alex");
        list.add("Lewis");
        System.out.println(list);
        list.sort(String::compareToIgnoreCase);
        System.out.println(list);


    }
}
