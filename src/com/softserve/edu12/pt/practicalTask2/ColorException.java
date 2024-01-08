package com.softserve.edu12.pt.practicalTask2;

public class ColorException extends RuntimeException{
    public ColorException(String message) {
        super("The provided color '" + message + "' is not known to the system");
    }

    public ColorException() {
    }
}
