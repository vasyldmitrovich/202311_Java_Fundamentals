package com.softserve.edu13.hw.task1;

public class Main {
    public static void main(String[] args) {
        String originalText = "abc";
        int shift = 3;

        String encryptedText = encrypt(originalText, shift);
        System.out.println("Encrypted: " + encryptedText);

        String decryptedText = decrypt(encryptedText, shift);
        System.out.println("Decrypted: " + decryptedText);
    }

    public static String encrypt(String s, int n) {
        StringBuilder encryptedText = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isLowerCase(c) ? 'a' : 'A';
                encryptedText.append((char) ((c - base + n) % 26 + base));
            } else {
                encryptedText.append(c);
            }
        }
        return encryptedText.toString();
    }

    public static String decrypt(String s, int n) {
        return encrypt(s, 26 - n);
    }
}
