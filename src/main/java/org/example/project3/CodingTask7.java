package org.example.project3;

public class CodingTask7 {
    public static void main(String[] args) {

        int sum=0;
        int num1=0;
        int num2=1;
        System.out.println("The first 10 numbers of Fibonacci series are: ");

        for(int i=0; i<2; i++){
            System.out.print(i+" ");
        }
        for(int j=0; j<8; j++){
            sum=num1+num2;
            num1=num2;
            num2=sum;
            System.out.print(sum+" ");

        }
    }
}
