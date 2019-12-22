package replit;

import java.util.Scanner;

public class RepeatSeperator96 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        String separator = scan.next();
        int count = scan.nextInt();

        String output="";

        for (int i = 1; i <count; i++) {
            output+=word+separator;
        }

        System.out.println(output.substring(0,output.lastIndexOf(separator)));
    }
}
