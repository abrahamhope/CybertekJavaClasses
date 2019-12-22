package replit;

import java.util.Scanner;

public class Directions {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String start = scan.next();
        String end = scan.next();

        if (start.equalsIgnoreCase("A") && end.equalsIgnoreCase("A")) {
            System.out.println("A found");
        } else if (start.equalsIgnoreCase("A") && end.equalsIgnoreCase("B")) {
            System.out.println("right");
        } else if (start.equalsIgnoreCase("A") && end.equalsIgnoreCase("C")) {
            System.out.println("right > down");
        } else if (start.equalsIgnoreCase("A") && end.equalsIgnoreCase("D")) {
            System.out.println("right > down > left");
        } else if (start.equalsIgnoreCase("b") && end.equalsIgnoreCase("b")) {
            System.out.println("B found");
        } else if (start.equalsIgnoreCase("b") && end.equalsIgnoreCase("c")) {
            System.out.println("down");
        } else if (start.equalsIgnoreCase("b") && end.equalsIgnoreCase("d")) {
            System.out.println("down > left");
        } else if (start.equalsIgnoreCase("b") && end.equalsIgnoreCase("a")) {
            System.out.println("down > left > up");
        }else if (start.equalsIgnoreCase("c") && end.equalsIgnoreCase("c")) {
            System.out.println("C found");
        } else if (start.equalsIgnoreCase("c") && end.equalsIgnoreCase("d")) {
            System.out.println("left");
        } else if (start.equalsIgnoreCase("c") && end.equalsIgnoreCase("a")) {
            System.out.println("left > up");
        } else if (start.equalsIgnoreCase("c") && end.equalsIgnoreCase("b")) {
            System.out.println("left > up > right");
        }else if (start.equalsIgnoreCase("d") && end.equalsIgnoreCase("d")) {
            System.out.println("D found");
        } else if (start.equalsIgnoreCase("d") && end.equalsIgnoreCase("a")) {
            System.out.println("up");
        } else if (start.equalsIgnoreCase("d") && end.equalsIgnoreCase("b")) {
            System.out.println("up > right");
        } else if (start.equalsIgnoreCase("d") && end.equalsIgnoreCase("c")) {
            System.out.println("up > right > down");

        }


    }
}
