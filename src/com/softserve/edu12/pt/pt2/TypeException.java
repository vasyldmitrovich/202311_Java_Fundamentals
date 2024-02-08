package com.softserve.edu12.pt.pt2;

class TypeException extends RuntimeException {
    public TypeException(String message) {

        super("The provided type '"  + message + "' is not know to the system");
    }

    public TypeException() {
    }
}
