package com.softserve.edu16.hw;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Comparator;

public class hw1 {
    public static void main(String[] args) throws IOException {
        String fileName = "src/com/softserve/edu16/file1.txt";
        var file = Path.of(fileName);
        String[] lines;
        if (Files.exists(file)) {
            lines = Files.lines(file).toArray(String[]::new);

            String fileName2 = "src/com/softserve/edu16/file2.txt";
            OutputStream file2 = Files.newOutputStream(Path.of(fileName2));

            for (int i = 0; i < lines.length-1 ;i++){
                byte[] buffer = (lines[i] + "\n").getBytes();
                file2.write(buffer, 0, buffer.length);
            }
            file2.close();

            System.out.println("file.txt has lines:" + lines.length);

            System.out.println("longest line:");
            Arrays.stream(lines)
                    .max(Comparator.comparing(String::length))
                    .ifPresent(System.out::println);
            Arrays.stream(lines)
                    .filter(line->line.contains("Name:"))
                    .forEach(System.out::println);

            Arrays.stream(lines)
                    .filter(line->line.contains("Birthday date:"))
                    .forEach(System.out::println);


        }



    }
}

