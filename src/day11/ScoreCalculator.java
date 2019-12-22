package day11;

import java.util.Scanner;

public class ScoreCalculator {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the score to find the result");
        int score=scan.nextInt();

        if(score<0  || score>100){
            System.out.println("Invalid Score");
        }else if( score==100){
            System.out.println("Perfect Score");
        }else if(score>70 && score<100){
            System.out.println("You have passed");
        }else{
            System.out.println("You have failed");
        }

    }
}
