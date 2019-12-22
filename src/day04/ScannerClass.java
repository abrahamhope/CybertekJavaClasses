package day04;

import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {

        //Step1 : Use Scanner class to create scanner object
        //that have this functionality
        //Scanner scan = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);
        //Ask user a question to answer (name)
        System.out.println("Please enter your name:");
        // capture what user typed on keyboard in console
        //scan.next()  Captures single word user enters
        String firstName = scan.next();

        // print the result of what we saved from the user input

        System.out.println("Nice to meet you, " + firstName);

        System.out.println("What is your age");
        //scan.nextInt() is capturing single number that user entered
        int age = scan.nextInt();

        System.out.println("Your age is:" + age);


    }
}
