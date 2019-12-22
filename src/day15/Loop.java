package day15;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the Number of Apples You Have");
        int apples=scan.nextInt();

        while(apples <=10){
            System.out.println("Eating an apple");
            apples++;
        }

        System.out.println("No more apples: ");


    }
}
