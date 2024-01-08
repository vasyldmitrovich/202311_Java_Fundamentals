package com.softserve.edu12.pt.practicalTask2;

public class TypeException extends RuntimeException{
    public TypeException(String message) {
        super("The provided type '" + message + "' is not known to the system");
    }

    public TypeException() {

    }
}
