package org.example;

public class CodingTask4 {
    public static void main(String[] args) {

        int[][]number={{1,2,3,4},{3,4,5,6},{6,7,8,9}};
        int sumOdd=0;
        int sumEven=0;
        for(int i=0; i<3;i++){
            for(int j=0; j<4; j++){
                if(number[i][j]%2!=0){

                    sumOdd=sumOdd+number[i][j];

                } else {sumEven=sumEven+number[i][j];}
            }

        }System.out.println("The sum of the even numbers is "+sumEven);
        System.out.println("The sum of the odd numbers is "+sumOdd);
    }
}
