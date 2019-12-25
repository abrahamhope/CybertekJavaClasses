package replit;

import java.util.Arrays;
import java.util.Scanner;

public class FirstAndLast140 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};

        String [] modifiedWords={};
        for (int i = 0; i < words.length; i++) {
            String firstAndLastLetters=""+words[i].charAt(0)+words[i].charAt(words[i].length()-1);
            modifiedWords[i]=firstAndLastLetters;
        }
        System.out.println(modifiedWords);
    }

}
