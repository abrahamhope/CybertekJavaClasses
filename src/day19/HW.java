package day19;

import java.util.Scanner;

public class HW {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter guest name:");
        String guestName=input.next();
        System.out.println("Do you want to enter new guest name:");
        String response=input.next();
String guests="";
        while(response.equalsIgnoreCase("yes")){
            guests+=guestName+", ";
            System.out.println("Please enter guest name:");
            guestName=input.next();
            System.out.println("Do you want to enter new guest name:");
            response=input.next();
        }


        System.out.println("Guest's list: "+guests+"");


    }

}
