package com.softserve.edu09.pt.pt1;

class HeavyBox {
    private int weight;
    private String name;

    public HeavyBox(int weight, String name) {
        this.weight = weight;
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "HeavyBox{" +
                "weight=" + weight +
                ", name='" + name + '\'' +
                '}';
    }
}
