package day09;

import java.util.Scanner;

public class CitizenTypeChecker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an age to find out the citizenship type");

        String citizenType;

        int age = scan.nextInt();
        if (age >= 65) {
             citizenType = "Senior";
        } else {
             citizenType = "Not Senior";
        }
        System.out.println("Citizen Type is: "+citizenType);

    }
}
