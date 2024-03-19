package org.example;

public class CodingTask9 {

    public static void main(String[] args) {

        int[] numbers = {12,34,5,78,65,23,50};
        int max = numbers[5];

        int second = numbers[4];
        for (int n : numbers) {
            if (n > second) {
                if (n > max) {
                    second=max;
                    max=n;
                } else
                    second=n;
            }
        }System.out.println(second);

    }
}
