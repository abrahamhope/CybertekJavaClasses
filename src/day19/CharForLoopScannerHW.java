package day19;

import java.util.Scanner;

public class CharForLoopScannerHW {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter a character to start the count");
        String line=scan.next();
for (char ichar='A'; ichar<='Z'; ichar++){
    line += ichar;
    System.out.println(line);
}

        //  HOMEWORK
        // CREATE AN INTERACTIVE PROGRAM TO ASK USER
        // STARTING CHARACTER AND ENDING CHARACTER
        // THEN PRINT EVERYTHING IN BETWEEN
        // IT COULD BE STARTING CHARACTER IS AFTER ENDING CHARACTER
        // FOR EXAMPLE USER CAN ENTER  Z A  , or A K
        // Can we ask user character ? NO!!!!
        // Ask user for String and pick first character by charAt(0)


    }
}
