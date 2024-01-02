package com.softserve.edu12.pt.Task2;

import java.util.Locale;

public class Plant {

    private int size;
    private Colour colour;
    private Type type;

    public Plant(int size, Colour colour, Type type) {
        this.size = size;
        this.colour = colour;
        this.type = type;
    }

    public Plant(int size, String colour, String type) {

        this.size = SizeException.validateSize(size,type);
        try {
            this.colour = Colour.valueOf(colour.toUpperCase(Locale.ROOT));
        } catch (IllegalArgumentException e) {
            throw new ColourException(colour);
        }
        try {
            this.type = Type.valueOf(type.toUpperCase(Locale.ROOT));
        } catch (IllegalArgumentException e) {
            throw new TypeException(type);
        }

    }

    public int getSize() {
        return size;
    }

    public Colour getColour() {
        return colour;
    }

    public Type getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Plant :" +
                " size = " + size +
                ", colour = " + colour +
                ", type = " + type;
    }
}
