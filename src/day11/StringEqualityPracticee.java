package day11;

import java.util.Scanner;

public class StringEqualityPracticee {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a word to see!");
        String myStr= scan.next();

        if (myStr.equals("Java")){
            System.out.println("Correct Word!");
        }else if(myStr.equals("Cava")){
            System.out.println("Pumpkin");
        }else{
            System.out.println("Not Java nor Pumpkin");
        }
    }
}
