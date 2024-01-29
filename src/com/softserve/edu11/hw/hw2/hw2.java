package com.softserve.edu11.hw.hw2;

public class hw2 {
    public static void main(String[] args) {
        String text = "I  am  learning    Java   Fundamental";
        System.out.println(text);
        System.out.println(text.replaceAll("\\s+", " ").replaceAll("\\s(\\p{Punct})","$1").trim());
    }
}
