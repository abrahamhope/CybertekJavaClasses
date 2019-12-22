package day10;

import java.util.Scanner;

public class SwitchPractice {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int inputSeconds, hours, minutes, seconds;

        System.out.println("Enter Seconds");
        inputSeconds=scan.nextInt();
        hours=inputSeconds/3600;
        minutes=inputSeconds/60;
        seconds=inputSeconds%3600;

        System.out.println(hours);

    }
}
