package org.example;

public class CodingTask8 {
    public static void main(String[] args) {

        int[]numbers={1,2,3,4,5,6,7,8,9};
        int max=numbers[5];
        int min=numbers[5];
        for(int n:numbers){
            if(n>max)
            {max=n;}
            if(n<min)
            {min=n;}
        }
        System.out.println(max+" is the maximum number, and "+min+" is the minimum number");

    }
}
