package com.softserve.edu04.hw.Task3;

public enum HTTPError {
    ERROR400("Bad Request"),
    ERROR401("Unauthorized"),
    ERROR402("Payment Required"),
    ERROR403("Forbidden"),
    ERROR404("Not Found"),
    ERROR405("Method Not Allowed"),
    ERROR406("Not Acceptable"),
    ERROR407("Proxy Authentication Required"),
    ERROR408("Request Timeout"),
    ERROR409("Conflict"),
    ERROR410("Gone");

    private final String errorType;

    HTTPError(String errorType){

        this.errorType = errorType;
    }

    public String getErrorType() {
        return errorType;
    }

    public static String checkHTTPError(int input){

       HTTPError httpError;

        httpError = switch (input){

           case 400 -> HTTPError.ERROR400;
           case 401 -> HTTPError.ERROR401;
           case 402 -> HTTPError.ERROR402;
           case 403 -> HTTPError.ERROR403;
           case 404 -> HTTPError.ERROR404;
           case 405 -> HTTPError.ERROR405;
           case 406 -> HTTPError.ERROR406;
           case 407 -> HTTPError.ERROR407;
           case 408 -> HTTPError.ERROR408;
           case 409 -> HTTPError.ERROR409;
           case 410 -> HTTPError.ERROR410;

           default -> throw new IllegalStateException("Unexpected value: " + input);
       };



        return httpError.getErrorType();
    }
}
