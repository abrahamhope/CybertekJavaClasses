package day05;

import java.util.Scanner;

public class TheScanner {
    public static void main(String[] args) {
        //ask user for name
        //and capture the result
        //print your name is this
        //ask user for birth year
        // and capture the result
        // print the age
        //ask user for height
        //capture the result
        // print the height
        Scanner scan = new Scanner(System.in);

        System.out.println("What is your name?");
//        String name = "Sam";
        String name = scan.next();
        System.out.println("My name is " + name);

        System.out.println("What is your birth year?");
        int birthYear= scan.nextInt();
        int currentYear= 2019;
        System.out.println("My birth year is "+birthYear);
        int age=currentYear-birthYear;
        System.out.println("I am "+age+" years old");

        System.out.println("How tall are you?");
        double  height=scan.nextDouble();
        System.out.println("I am :"+height);
    }
}
