package com.softserve.edu04.hw.HomeTask3;

public enum HttpError {
    BAD_REQUEST(400, "Bad Request"),
    UNAUTHORIZED(401, "Unauthorized"),
    PAYMENT_REQUIRED(402, "Payment Required"),
    FORBIDDEN(403, "Forbidden"),
    NOT_FOUND(404, "Not Found"),
    METHOD_NOT_ALLOWED(405, "Method Not Allowed"),
    ;

    private int errorNumber;
    private String name;

    HttpError(int errorNumber, String name) {
        this.errorNumber = errorNumber;
        this.name = name;
    }

    public int getErrorNumber() {
        return errorNumber;
    }

    public String getName() {
        return name;
    }
}
