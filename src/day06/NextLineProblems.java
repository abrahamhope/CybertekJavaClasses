package day06;

import java.util.Scanner;

public class NextLineProblems {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("What is your name?");
        String name=scan.nextLine();
        System.out.println("Your name is "+name);

        System.out.println("What is your age?");
        int age=scan.nextInt();
        scan.nextLine(); // needed to prevent the "enter" to jump to the below ".nextLine().
        // Otherwise when pressed enter after age, it will not allow me to enter address.
        System.out.println("Your age is "+age);

        System.out.println("What is your address?");
        String address=scan.nextLine();
        System.out.println("Your address is "+address);


    }
}
