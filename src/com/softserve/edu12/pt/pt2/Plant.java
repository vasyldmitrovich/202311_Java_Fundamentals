package com.softserve.edu12.pt.pt2;

import java.util.HashMap;
import java.util.Map;

class Plant {
    private int size;
    private Color color;
    private Type type;

    public Plant(int size, Color color, Type type) {
        this.size = size;
        this.color = color;
        this.type = type;
    }

    public Plant(int size, String color, String type) {


        try {
            this.color = Color.valueOf(color.toUpperCase());
        } catch (IllegalArgumentException e) {
            throw new ColorException(color);
        }
        try {
            this.type = Type.valueOf(type.toUpperCase());
        } catch (IllegalArgumentException e) {
            throw new TypeException(type);
        }
        if (!normalSize(size,this.type)) {throw new SizeException("" +size);};
        this.size = size;

    }
    static boolean normalSize(int size,Type type){
        switch (type){
            case TREE -> {
                return size >= 2 && size <= 50;
            }
            case GRASS -> {
                return size >= 1 && size <= 5;
            }
            case BUSH -> {return size >= 1 && size <= 2;}
        }

        return false;
    }

    public int getSize() {
        return size;
    }

    public Color getColor() {
        return color;
    }

    public Type getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Plant{" +
                "size=" + size +
                ", color=" + color +
                ", type=" + type +
                '}';
    }
}
