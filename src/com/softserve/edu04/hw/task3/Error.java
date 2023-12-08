package com.softserve.edu04.hw.task3;

import java.util.Scanner;
enum HTTP {
    BAD_REQUEST("Bad request"),
    UNAUTHORIZED("Unauthorized"),
    PAYMENT_REQUIRED("Payment required"),
    FORBIDDEN("Forbidden"),
    NOT_FOUND("Not found"),
    METHOD_NOT_ALLOWED("Method not allowed");

    private final String name;

    HTTP(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

 public class Error {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HTTP http;
        System.out.print("Enter the error code: ");
        int numError = scanner.nextInt();

        switch (numError) {
            case 400:
                System.out.println(HTTP.BAD_REQUEST.getName());
                break;
            case 401:
                System.out.println(HTTP.UNAUTHORIZED.getName());
                break;
            case 402:
                System.out.println(HTTP.PAYMENT_REQUIRED.getName());
                break;
            case 403:
                System.out.println(HTTP.FORBIDDEN.getName());
                break;
            case 404:
                System.out.println(HTTP.NOT_FOUND.getName());
                break;
            case 405:
                System.out.println(HTTP.METHOD_NOT_ALLOWED.getName());
                break;
            default:
                System.out.println("I can't identify the error by this code");
        }
    }
}
