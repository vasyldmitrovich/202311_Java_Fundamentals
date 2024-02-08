package com.softserve.edu12.pt.pt2;

class SizeException extends RuntimeException{
    public SizeException(String message) {

        super("Size  '" + message + "' is out of range");
    }

    public SizeException() {
    }
}
