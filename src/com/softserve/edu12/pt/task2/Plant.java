package com.softserve.edu12.pt.task2;

public class Plant {
    private int size;
    private Type type;
    private Color color;

    public Plant(int size, String type, String color) throws ColorException, TypeException, SizeException {
        Color c = colorStrToEnum(color);
        Type t = typeStrToEnum(type);
        this.size = checkSize(size);
        this.type = t;
        this.color = c;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    private Color colorStrToEnum(String color) throws ColorException {
        switch (color.toLowerCase()) {
            case "blue":
                return Color.BLUE;
            case "red":
                return Color.RED;
            case "white":
                return Color.WHITE;
            case "yellow":
                return Color.YELLOW;
            case "green":
                return Color.GREEN;
            default:
                throw new ColorException("This color does not exist. Choose another color!");
        }
    }

    private Type typeStrToEnum(String type) throws TypeException {
        switch (type.toUpperCase()) {
            case "HERB":
                return Type.HERB;
            case "CLIMBER":
                return Type.CLIMBER;
            case "CREEPER":
                return Type.CREEPER;
            case "TREE":
                return Type.TREE;
            case "SHRUB":
                return Type.SHRUB;
            default:
                throw new TypeException("Coose only HERB, CLIMBER, TREE, CREEPER or SHRUB!");
        }

    }

    private int checkSize(int size) throws SizeException {
        if ((size > 0) && (size <= 100)) {
            return size;
        } else throw new SizeException("Enter size between 0 and 100!");
    }

    @Override
    public String toString() {
        return "Plant{" +
                "size=" + size +
                ", type=" + type.toString() +
                ", color=" + color.toString() +
                '}';
    }
}
