package org.example.project4;

import java.util.Arrays;

public class CodingTask5 {
    public static void main(String[] args) {
        String word1="listen";
        String word2="silent";
        if(word1.length()==word2.length()){
            char[]newWord1=word1.toCharArray();
            char[]newWord2=word2.toCharArray();
            Arrays.sort(newWord1);
            Arrays.sort(newWord2);
            if(Arrays.equals(newWord1,newWord2)){
                System.out.println("anagram");
            }else{
                System.out.println("not anagram");
            }
        }else{
            System.out.println("not anagram");
        }
    }
}
