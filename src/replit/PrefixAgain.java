package replit;

import java.util.Scanner;

public class PrefixAgain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int n = scan.nextInt();

       /*
       Given a string, consider the prefix string made of the first n chars of the string.
       Does that prefix string appear somewhere else in the string?
Assume that the string is not empty and that n is in the range from 1 till str.length().

        create a prefix string using n
        check if it is repeating
        true if repeating false if not

        */
        String prefix=str.substring(0,n);
        int count=0;
        for (int i = 0; i < str.length()-n; i++) {
            if(prefix.equals(str.substring(i,i+n))){
                count++;
            }
        }
        System.out.println(count>1);
    }
}
