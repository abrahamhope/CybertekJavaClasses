package day08;

import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your age to find out if you can vote:");
        int age=scan.nextInt();
        if (age>=18){
            System.out.println("You are ready to vote");
        }else{
            System.out.println("Wait until you are 18");
        }
    }
}
