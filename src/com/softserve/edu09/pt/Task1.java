package com.softserve.edu09.pt;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<HeavyBox> arr = new ArrayList<>();
        arr.add(new HeavyBox(4, "content1"));
        arr.add(new HeavyBox(2, "content2"));
        arr.add(new HeavyBox(3, "content3"));
        arr.add(new HeavyBox(5, "content4"));
        arr.add(new HeavyBox(6, "content5"));

        for( var s: arr ) {
            System.out.println(s);
        }

        System.out.println();

        var first = arr.get(0);
        first.setWeight(first.getWeight() + 1 );

        for( var s: arr ) {
            System.out.println(s);
        }

        System.out.println();

        arr.remove(arr.size() - 1);
        for( var s: arr ) {
            System.out.println(s);
        }

        System.out.println();

        arr.clear();
        for( var s: arr ) {
            System.out.println(s);
        }

        System.out.println("END");

    }

}

class HeavyBox {
    int weight;
    String content;

    public HeavyBox(int weight, String content) {
        this.weight = weight;
        this.content = content;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
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
        return "HeavyBox{" +
                "weight=" + weight +
                ", content='" + content + '\'' +
                '}';
    }
}

