package org.example.project4;

import java.util.Scanner;

public class CodingTask4 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Input a word or sentence to see if it's Palindrome: ");
        String input= scan.nextLine().replace(" ","");
        StringBuilder str=new StringBuilder(input);
        boolean isPalindrome=true;
        if(input.equalsIgnoreCase(str.reverse().toString())){
            System.out.println(isPalindrome+", "+"the input text is Palindrome");
        }else{
            System.out.println(!isPalindrome+", "+"the input text is not Palindrome");
        }

    }
}
