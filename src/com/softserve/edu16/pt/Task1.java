package com.softserve.edu16.pt;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Comparator;

public class Task1 {
    public static void main(String[] args) throws IOException {

        String filename = "D:\\Java SoftServe\\myText.txt";
        var file = Path.of(filename);

        if (Files.exists(file)) {
            System.out.println("It exists");
            var lines = Files.lines(file).toArray(String[]::new);
            System.out.println(Arrays.stream(lines).count());
            Arrays.stream(lines).map(l -> l.length()).forEach(System.out::println);
            Arrays.stream(lines)
                    .filter(line -> !line.isEmpty())
                    .max(Comparator.comparing(String::length))
                    .ifPresent(System.out::println);
            Arrays.stream(lines)
                    .filter(line -> !line.isEmpty())
                    .min(Comparator.comparing(String::length))
                    .ifPresent(x -> {
                                     System.out.println(x);
                                     System.out.println(x.length());
                                     }
                                     );
            Arrays.stream(lines)
                    .filter(i -> i.contains("forest"))
                    .forEach(System.out::println);

        }

    }
}
