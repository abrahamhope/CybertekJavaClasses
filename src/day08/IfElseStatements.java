package day08;

import java.util.Scanner;

public class IfElseStatements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("What is your current speed, dear drive");

        int currentSpeed = scan.nextInt();

        System.out.println("What is the speed limit");
        int speedLimit = scan.nextInt();


        if (currentSpeed>=speedLimit) {
            System.out.println("get pulled over byt the police");
            System.out.println("given ticket");
        }
        }
    }

