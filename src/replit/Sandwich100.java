package replit;

import java.util.Scanner;

public class Sandwich100 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        //breadjambread
        int firstBread=str.indexOf("bread");
        int lastBread=str.lastIndexOf("bread");

        System.out.println(str.substring(firstBread+5, lastBread));

        if(lastBread==firstBread){
            System.out.println("nothing");
        }
    }
}
