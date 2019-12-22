package replit;

import java.util.Scanner;

public class Zombie87 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int inhabitants = scan.nextInt();
        int day=0;
       while((inhabitants)>1) {
            inhabitants=inhabitants/2;
            System.out.println( "Day "+day+" [ "+inhabitants+" ]");
            day++;

        }
       System.out.println("---- EXTINCT ----");


    }
}
