package com.softserve.edu09.pt.pt2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class pt2 {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        var sc = SCANNER.useDelimiter(",");
        List<String> data = new ArrayList<>();
        while (sc.hasNext()) {
            String el = sc.nextLine();
            if (!data.contains(el)) {
                data.add(el);
            }
        }
        System.out.println(data);

    }
}
