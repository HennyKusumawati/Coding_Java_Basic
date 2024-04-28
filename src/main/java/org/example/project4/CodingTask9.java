package org.example.project4;

import java.util.Objects;

public class CodingTask9 {
    public static void main(String[] args) {
        String word = "abracadabra";
        for (int i = 0; i < word.length(); i++) {
            int count=0;
            for (int j = 0; j < word.length(); j++) {
                //   if(word.charAt(i)==word.charAt(j))
                if(Objects.equals(word.charAt(i), word.charAt(j)))
                {
                    count++;
                }
            } if(count==1){
                System.out.println("The first non-repeating character in a given string \""
                        +word+"\" is char \""+word.charAt(i)+"\"");
                break;
            }
        }

    }
}
