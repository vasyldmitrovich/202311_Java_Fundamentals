package com.softserve.edu04.hw.task3;

import java.util.Scanner;

enum HTTPError{//Move to file like HTTPError.java. Enum should not be inner
    ERROR401(401), ERROR402(402), ERROR400(400);
    private final int number;

    HTTPError(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
}

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
