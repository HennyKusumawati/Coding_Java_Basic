package org.example.project4;

public class CodingTask2 {
    public static void main(String[] args) {
        String words="Javacoding345678#$%^&";
        String newWord=words.replaceAll("[^A-Za-z]","");
        System.out.println(newWord.length());

    }
}
