package day17;

import java.util.Scanner;

public class StringLoop {
    public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
        System.out.println("Enter your name below:");
       String name= scan.nextLine();   // if you have a complain in life: call 1-800-Alexander

        // get each and every character and print them out vertically..

//        System.out.println(name.charAt(0));
//        System.out.println(name.charAt(1));
//        System.out.println(name.charAt(2));
//        System.out.println(name.charAt(3));
//        System.out.println(name.charAt(4));
//        System.out.println(name.charAt(5));
//        System.out.println(name.charAt(6));
//        System.out.println(name.charAt(7));
//        System.out.println(name.charAt(8));

        int x=0;
while(x<name.length()){
    System.out.println(name.charAt(x));
++x;
}
    }
}
