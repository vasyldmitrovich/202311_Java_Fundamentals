package com.softserve.edu04.hw.Task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input error number to get definition (from 400 to 410)");
        int input = scanner.nextInt();
        System.out.printf("Error %d - %s",input,HTTPError.checkHTTPError(input));//Ok
    }
}
