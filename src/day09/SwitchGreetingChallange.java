package day09;

import java.util.Scanner;

public class SwitchGreetingChallange {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String greeting = "";
        System.out.println("enter a number for greeting in different languages");
        int num = scan.nextInt();
        switch (num) {
            case 1:
                greeting = "Hello";
                break;
            case 2:
                greeting = "Salam";
                break;
            case 3:
                greeting = "Hola";
                break;

            case 4:
                greeting = "Privet";
                break;
            case 5:
                greeting = "Merhaba";
                break;
            case 6:
                greeting = "Szia";
                break;
            case 7:
                greeting = "Bonjour";
                break;
            default:
                System.out.println("Unknown");
        }
        System.out.println(greeting + ", SDET");
    }
}
