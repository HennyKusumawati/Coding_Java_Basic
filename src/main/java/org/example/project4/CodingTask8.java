package org.example.project4;

public class CodingTask8 {
    public static void main(String[] args) {
        String[]str={"Atlanta","Milton","Roswell","Augusta","Milledgeville","Athens"};
        for (String s : str) {
            if (s.startsWith("A")) {
                System.out.println(s.toLowerCase());
            }
        }
    }
}
