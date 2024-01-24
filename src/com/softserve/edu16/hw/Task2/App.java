package com.softserve.edu16.hw.Task2;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;

import static java.nio.charset.StandardCharsets.UTF_8;

public class App {

    public static void main(String[] args)throws IOException {

        var sourceFileName = "hw2Source.java";
        var resultFileName = "hw2Result.java";
        var sourceFile = Path.of(sourceFileName);
        var source = Files.lines(sourceFile).toArray(String[]::new);
        var file = new File(resultFileName);

        try ( var writer = new PrintWriter(new FileWriter(file,UTF_8))) {
            Arrays.stream(source)
                    .map(line -> line.replace("public", "private"))
                    .forEach(writer::println);
        }
    }
}

