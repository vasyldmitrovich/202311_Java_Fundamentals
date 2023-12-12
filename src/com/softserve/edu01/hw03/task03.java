package com.softserve.edu01.hw03;

import java.util.Scanner;

public class task03 {
    enum HTTPError {
        ERROR_400("Bad Request"),
        ERROR_401("Unauthorized"),
        ERROR_402("Payment Required"),
        UNKNOWN_ERROR("Unknown Error");

        private final String errorName;

        HTTPError(String errorName) {
            this.errorName = errorName;
        }

        public String getErrorName() {
            return errorName;
        }
    }

    public static class HTTPErrorMapping {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter an HTTP error number: ");
            int errorCode = scanner.nextInt();

            scanner.close();
            HTTPError[] errors = HTTPError.values();
            boolean found = false;

            for (HTTPError error : errors) {
                if (error.ordinal() + 400 == errorCode) {
                    System.out.println("HTTP Error " + errorCode + ": " + error.getErrorName());
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("HTTP Error " + errorCode + ": " + HTTPError.UNKNOWN_ERROR.getErrorName());
            }
        }
    }

}
