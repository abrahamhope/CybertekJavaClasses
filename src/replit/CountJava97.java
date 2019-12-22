package replit;

import java.util.Scanner;

public class CountJava97 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        String word = scan.next();

        int count=0;
        for (int i = 0; i <word.length()-1 ; i++) {
            if(word.substring(i,i+2).contains("hi")){
                count++;
            }
        }
        System.out.println(count);
    }
}
