package com.softserve.edu16.hw.homeTask02;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        Path sourceFilePath = Paths.get("sourceFile.java");
        Path destinationFilePath = Paths.get("destinationFile.java");

        try {
            String content = new String(Files.readAllBytes(sourceFilePath));
            String modifiedContent = content.replaceAll("\\bpublic\\b", "private");

            Files.write(destinationFilePath, modifiedContent.getBytes());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
