package com.softserve.edu09.pt;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static final Scanner SCANNER = new Scanner( System.in );

    public static void main(String[] args) {
        var scanner = SCANNER.useDelimiter(", ");
        List<Integer> data = new ArrayList<>();
        while(scanner.hasNext()) {
            String el = scanner.next();
            int in = Integer.parseInt(el.strip());
            if( !data.contains( in )) {
                data.add(in);
            }
        }
        System.out.println(data);
    }
}

