package org.example.project3;

public class CodingTask1 {
    public static void main(String[] args) {

        int[] temp = {30, 32, 34, 60, 45, 38, 50};

        int highest = temp[3];
        int lowest = temp[5];

        for (int t : temp) {
            if (t > highest) {
                highest = t;
            }
            if (t < lowest) {
                lowest = t;
            }
        }
        System.out.println("The lowest temperature of the week is " + lowest);
        System.out.println("The highest temperature of the week is " + highest);


    }
}
