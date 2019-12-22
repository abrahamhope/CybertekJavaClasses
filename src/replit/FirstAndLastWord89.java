package replit;

import java.util.Scanner;

public class FirstAndLastWord89 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //WRITE YOUR CODE HERE
        char first=word.charAt(0);
        char last=word.charAt(word.length()-1);
        System.out.println(""+first+last);

    }

}

