package org.example.project4;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class CodingTask10 {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("Java");
        words.add("Java");
        words.add("is");
        words.add("is");
        words.add("very");
        words.add("easy");
        words.add("easy");
        System.out.print("Before: ");
       for(String w:words){
           System.out.print(w+" ");
       }
        System.out.println();
        System.out.print("After: ");
        Set<String> newWords = new LinkedHashSet<>(words);
        for (String s : newWords) {
            System.out.print(s + " ");
        }
    }
}
