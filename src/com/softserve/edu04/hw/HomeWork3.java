package com.softserve.edu04.hw;

import java.util.Scanner;

public class HomeWork3 {
    public static final Scanner SCANNER = new Scanner( System.in );

    public static void main(String[] args) {
        System.out.println("Enter an HTTP error: ");
        int httpErrorCode = SCANNER.nextInt();

        switchRoutine(httpErrorCode);
    }

    private static void switchRoutine(int httpErrorCode) {
        HTTPError hr;
        switch(httpErrorCode) {

            case 400:
                hr = HTTPError.BAD_REQUEST;
                resultingAnnouncement(httpErrorCode, hr);
                break;
            case 401:
                hr = HTTPError.UNAUTHORIZED;
                resultingAnnouncement(httpErrorCode, hr);
                break;
            case 402:
                hr = HTTPError.PAYMENT_REQUIRED;
                resultingAnnouncement(httpErrorCode, hr);
                break;
            case 403:
                hr = HTTPError.FORBIDDEN;
                resultingAnnouncement(httpErrorCode, hr);
                break;
            case 404:
                hr = HTTPError.NOT_FOUND;
                resultingAnnouncement(httpErrorCode, hr);
                break;
            case 405:
                hr = HTTPError.METHOD_NOT_ALLOWED;
                resultingAnnouncement(httpErrorCode, hr);
                break;
            default:
                System.out.println("Something went wrong");
                break;
        }
    }

    private static void resultingAnnouncement (int httpErrorCode, HTTPError hr) {
        System.out.println("Error code " + httpErrorCode + " stands for '" + hr.plainName + "'.");
    }
}

enum HTTPError {//Write all classes and enum in separate files for this enum move this enum to HTTPError.java file
    BAD_REQUEST("Bad request"),
    UNAUTHORIZED("Unauthorized"),
    PAYMENT_REQUIRED("Payment required"),
    FORBIDDEN("Forbidden"),
    NOT_FOUND("Not found"),
    METHOD_NOT_ALLOWED("Method not allowed");

    String plainName;

    HTTPError(String plainName) {
        this.plainName = plainName;
    }

    public String getPlainName() {
        return plainName;
    }
}