package com.softserve.edu12.pt.pt2;

class ColorException extends RuntimeException {
    public ColorException(String message) {
        super("The provided color '"  + message + "' is not know to the system");
    }

    public ColorException() {
    }
}
