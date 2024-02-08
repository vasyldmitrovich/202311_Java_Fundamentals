package com.softserve.edu16.pt.pt1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Comparator;

public class pt1{
    public static void main(String[] args) throws IOException {
        String fileName = "src/com/softserve/edu16/mytext.txt";
        var file = Path.of(fileName);
        if (Files.exists(file)) {
            String[] lines = Files.lines(file).toArray(String[]::new);
            System.out.println("There are " + lines.length + " lines in the file");
            System.out.println("Characters per line:");
            for (int i = 0; i < 10; i++) {
                System.out.println("№" + i + " Characters:" + lines[i].length());
            }
            System.out.println("MAX:");
            Arrays.stream(lines)
                    .max(Comparator.comparing(String::length))
                    .ifPresent(System.out::println);
            System.out.println("MIN:");
            Arrays.stream(lines)
                    .min(Comparator.comparing(String::length))
                    .ifPresent(System.out::println);
            System.out.println("have var:");
            Arrays.stream(lines)
                    .filter(line->line.contains("var"))
                    .forEach(System.out::println);

        }
    }

}
