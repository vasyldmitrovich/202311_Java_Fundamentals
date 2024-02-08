package com.softserve.edu16.hw.homeTask01;

import java.io.*;
import java.nio.file.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Path pathToFile1 = Paths.get("file1.txt");
        List<String> lines = Arrays.asList(
                "I am Oleksandr.",
                "My development started 2 month ago.",
                "I am Java programmer.",
                "I like Java."
        );
        Files.write(pathToFile1, lines);
        List<String> fileContent = Files.readAllLines(pathToFile1);
        String longestLine = Collections.max(fileContent, Comparator.comparing(String::length));
        Path pathToFile2 = Paths.get("file2.txt");
        try (BufferedWriter writer = Files.newBufferedWriter(pathToFile2)) {
            writer.write("Number of lines: " + fileContent.size());
            writer.newLine();
            writer.write("Longest line: " + longestLine);
            writer.newLine();
            writer.write("Name: ChatGPT, Birthday: January 1, 2020");
        }
    }
}
