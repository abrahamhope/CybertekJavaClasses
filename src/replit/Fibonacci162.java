package replit;

import java.util.Arrays;
import java.util.Scanner;

public class Fibonacci162 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        fib(num);
    }

    public static void fib(int num){
        //WRITE YOUR CODE HERE
        int [] fibArr=new int[100];
        fibArr[0]=0;
        fibArr[1]=1;
        for (int i = 2; i < 100; i++) {
            fibArr[i]=fibArr[i-1]+fibArr[i-2];
        }
        System.out.println(fibArr[num]);
}
}
