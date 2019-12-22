package day06;

import java.util.Scanner;

public class Remainder {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the minutes as whole number");
        int minutes=scan.nextInt();
        int hourPart=minutes/60;
        int remainderMinute = minutes%60;

        System.out.println(minutes +" minutes"+ " equal to " + hourPart + " hours and " + remainderMinute + " minutes");
    }
}
