package com.softserve.edu09.pt.Task1;

public class HeavyBox {

    private static int idNode = 1;

    private int id;
    private int weight;
    private String content;

    public HeavyBox(int weight, String content) {
        this.id = idNode++;
        this.weight = weight;
        this.content = content;
    }

    public int getWeight() {
        return weight;
    }

    public void  setWeight(int weight) {
        this.weight = weight;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return id + " Element : "+
                "Weight = " + weight +
                ", Content = " + content;
    }
}
