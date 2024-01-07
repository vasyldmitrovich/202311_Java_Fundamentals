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
        return switch (color.toLowerCase()) {
            case "blue" -> Color.BLUE;
            case "red" -> Color.RED;
            case "white" -> Color.WHITE;
            case "yellow" -> Color.YELLOW;
            case "green" -> Color.GREEN;
            default -> throw new ColorException("This color does not exist. Choose another color!");
        };
    }

    private Type typeStrToEnum(String type) throws TypeException {
        return switch (type.toUpperCase()) {
            case "HERB" -> Type.HERB;
            case "CLIMBER" -> Type.CLIMBER;
            case "CREEPER" -> Type.CREEPER;
            case "TREE" -> Type.TREE;
            case "SHRUB" -> Type.SHRUB;
            default -> throw new TypeException("Choose only HERB, CLIMBER, TREE, CREEPER or SHRUB!");
        };

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
