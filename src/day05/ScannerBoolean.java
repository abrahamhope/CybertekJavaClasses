package day05;

import java.util.Scanner;

public class ScannerBoolean {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);

        System.out.println("Are you recording?");
        boolean isRecording= input.nextBoolean();

        System.out.println("We are recording "+isRecording);


    }
}
