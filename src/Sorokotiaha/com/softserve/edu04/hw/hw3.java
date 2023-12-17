package Sorokotiaha.com.softserve.edu04.hw;

import java.util.Scanner;

public class hw3 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        System.out.println("Enter the error number:");
        int numberError = sc.nextInt();
        HTTPError httpError = HTTPError.getHTTPError(numberError);
        System.out.println("" + numberError + " - " + httpError.textError);
    }

    enum HTTPError {
        BADREQUEST("Bad Request"), UNAUTHORIZED("Unauthorized"), PAYMENTREQUIRED("Payment Required"), FORBIDDEN("Forbidden"), NOTFOUND("Not Found");
        public final String textError;

        HTTPError(String textError) {
            this.textError = textError;
        }


        public static HTTPError getHTTPError(int number) {
            return switch (number) {
                case 400 -> BADREQUEST;
                case 401 -> UNAUTHORIZED;
                case 402 -> PAYMENTREQUIRED;
                case 403 -> FORBIDDEN;
                case 404 -> NOTFOUND;
                default -> null;
            };
        }
    }
}
