package com.softserve.edu16.hw.homeTask02;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        Path file1 = Paths.get("file1.java");
        Path file2 = Paths.get("file2.java");

        try {
            String content = new String(Files.readAllBytes(file1));
            String modifiedContent = content.replaceAll("\\bpublic\\b", "private");
            Files.write(file2, modifiedContent.getBytes());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
