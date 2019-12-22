package replit;

import java.util.Scanner;

public class Party86 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter guest name:");
        String guestName = input.next();
        System.out.println("Do you want to enter new guest name:");
        String response = input.next();
        String guests = guestName+", ";
        while (response.equalsIgnoreCase("yes")) {
            System.out.println("Please enter guest name:");
            guestName = input.next();
            System.out.println("Do you want to enter new guest name:");
            response = input.next();
            guests+=guestName+", ";
        }
        System.out.println("Guest's list: " + guests.substring(0, (guests.length()-2)) + "");
    }
}
