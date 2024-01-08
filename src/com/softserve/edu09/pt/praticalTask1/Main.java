package com.softserve.edu09.pt.praticalTask1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        var scanner = SCANNER.useDelimiter(", ");
        List<Integer> data = new ArrayList<>();
        while (scanner.hasNext()){
            String el = scanner.next();
            int i = Integer.parseInt(el.trim());
            if(!data.contains(i)){
                data.add(i);
            }
        }
        System.out.println(data);
    }
}
