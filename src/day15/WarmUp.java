package day15;

import java.util.Scanner;

public class WarmUp {
    public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
       String myName =scan.next();
        if (myName.length() <= 4) {
            System.out.println("short name");
        } else if (myName.length() > 4 && myName.length() < 11) {
            System.out.println("medium name");
        }else if (myName.length()>=11){
            System.out.println("long name");
        }
    }
}
