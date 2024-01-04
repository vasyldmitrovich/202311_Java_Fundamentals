package com.softserve.edu13.hw.homeTask1;

public class Main {
    public static void main(String[] args) {
        String cesarEcryptString = "hello i love java";
        int shift = 3;
        String encryptedString = encrypt(cesarEcryptString, shift);
        System.out.println(cesarEcryptString + " -> " + encryptedString);
        System.out.println("Decrypting...");
        System.out.println(encryptedString + " -> " + decrypt(encryptedString, shift));


    }

    static String encrypt(String s, int n) {
        StringBuilder result = new StringBuilder();
        for (char character : s.toCharArray()) {
            if (character != ' ') {
//                int originalAlphabetPosition = character - 'a';
//                int newAlphabetPosition = (originalAlphabetPosition + n) % 26;
//                char newCharacter = (char) ('a' + newAlphabetPosition);
//                result.append(newCharacter);
                result.append((char) ((((character - 'a') + n) % 26) + 'a'));
            } else {
                result.append(character);
            }
        }
        return String.valueOf(result);
    }

    static String decrypt(String s, int n) {
        return encrypt(s, 26 - (n % 26));
    }

}
