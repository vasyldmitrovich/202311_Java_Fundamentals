package com.softserve.edu16.pt.Task1;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Comparator;

public class App {
    public static void main(String[] args) throws IOException {

        var fileName = "mytext.txt";
        var file = Path.of(fileName);
        var lines = Files.lines(file).toArray(String[]::new);

        for (int i = 0; i < lines.length; i++) {
            System.out.println("Line " + (i + 1) + " = "+ lines[i].length());
        }

        System.out.println("The longest line from file: ");
        Arrays.stream(lines)
                .max(Comparator.comparingInt(String::length))
                .ifPresent(System.out::println);

        System.out.println("The shortest line from file: ");
        Arrays.stream(lines)
                .min(Comparator.comparingInt(String::length))
                .ifPresent(System.out::println);
        System.out.println("Lines with \"var\"");
        Arrays.stream(lines)
                .filter(line -> line.contains("var"))
                .forEach(System.out::println);

    }

}
