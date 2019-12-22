package day09;

import java.util.Scanner;

public class InitializingVariable {
    public static void main(String[] args) {
       // int num ;

        //a variable inside a method, must get inital
        // value before it's being used for the first time
        //and there should be any chance
        //this variable does not get vaule before usage

        //System.out.println(num);

        Scanner scan = new Scanner(System.in);
        String greeting = "";
        System.out.println("enter a number for greeting in different languages");
        int num = scan.nextInt();

        if (num == 1) {
            greeting = "Hello";
        } else if (num == 2) {
            greeting = "Salam";
        } else if (num == 3) {
            greeting = "Hola";
        } else if (num == 3) {
            greeting = "Privet";
        } else if (num == 4) {
            greeting = "Merhaba";
        } else if (num == 5) {
            greeting = "Szia";
        } else if (num == 7) {
            greeting = "Bonjour";
        }else{
            System.out.println("Unknown");
        }
        System.out.println(greeting + ", SDET");
    }
}
