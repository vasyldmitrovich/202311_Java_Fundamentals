package com.softserve.edu04.hw.task3;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of error: ");
        int n = Integer.parseInt(scanner.nextLine());
        boolean founded = false;
        for (HTTPError err: HTTPError.values()) {
            if (err.getNumber() == n) {
                System.out.println(err);
                founded = true;
                break;
            }
        }
        if (!founded){
            System.out.println("Name of error are not founded!");
        }

    }
    
}
