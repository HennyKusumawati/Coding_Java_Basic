package org.example.project3;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class CodingTask6 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter number greater than 0");
        int number = scan.nextInt();
        boolean isPrime = true;
        for (int i = 2; i <= sqrt(number); i++) {
            if (number > 1) {
                if ((number % i) == 0) {
                    isPrime = false;
                }
            }
        }
        if (isPrime) {
            System.out.println("Prime");
        } else {
            System.out.println("Not prime");
        }
    }
}
