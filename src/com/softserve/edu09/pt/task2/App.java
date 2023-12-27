package com.softserve.edu09.pt.task2;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the line of numbers with coma");
        String lineNumbers = scanner.nextLine();
        String[] arr = lineNumbers.split(",");
        ArrayList<String> noDuplicateArr = new ArrayList<>();
        for (var ar : arr) {
            boolean founded = false;
            for (var n : noDuplicateArr) {
                if (ar.equals(n)) {
                    founded = true;
                    break;
                }
            }
            if (!founded) {
                noDuplicateArr.add(ar);
            }
        }
        String str = String.join(",", noDuplicateArr);
        System.out.println(str);


    }
}
