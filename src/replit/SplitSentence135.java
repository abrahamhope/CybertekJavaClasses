package replit;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class SplitSentence135 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        String[] splitSentence=sentence.split(" ");
        for (int i = splitSentence.length-1; i>=0 ; i++) {
            System.out.println(splitSentence[i]);

        }

        String reversed="";
int length=reversed.length()-1;
        reversed.substring(0,length);
        //type your code below

    }
}
