package day09;

import java.util.Scanner;

public class OddEvenPractice {
    public static void main(String[] args) {
        //Task 1
        //Divide by 2 remainder is even, remainder 1 is odd
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number to test if it is even or odd");
        int number=scan.nextInt();
        int remainder=number%2;

        if(remainder==0){
            System.out.println("This is an even number");
        }else if(remainder!=0){
            System.out.println("This is an odd number");
        }

    }
}
