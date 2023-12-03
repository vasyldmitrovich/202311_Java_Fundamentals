package com.softserve.edu04.hw.HomeTask3;

import static com.softserve.edu04.hw.App.SCANNER;

public class HomeTask3 {
    public static void run() {
        System.out.print("Input a number representing an HTTP error:  ");
        int httpErrorNumber = Integer.parseInt(SCANNER.nextLine());
        System.out.println("Error is " + getErrorByNumber(httpErrorNumber).getName());


    }

    public static HttpError getErrorByNumber(int errorNumber) {
        return switch (errorNumber) {
            case 400 -> HttpError.BAD_REQUEST;
            case 401 -> HttpError.UNAUTHORIZED;
            case 402 -> HttpError.PAYMENT_REQUIRED;
            case 403 -> HttpError.FORBIDDEN;
            case 404 -> HttpError.NOT_FOUND;
            case 405 -> HttpError.METHOD_NOT_ALLOWED;
            default -> throw new IllegalArgumentException();
        };


    }
}
