package com.softserve.edu09.pt.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter your numbers: ");
        var scanner = SCANNER.useDelimiter(", ");
        List<String> data = new ArrayList<>();
        while (scanner.hasNext()) {
            String el = scanner.next();
            if (!data.contains(el)) {
                data.add(el);
            }
        }
        System.out.println(data);
    }
}
