package replit;

import java.util.Arrays;
import java.util.Scanner;

public class Short126 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        String [] allWords= str.split(",");
        String shortestWords=allWords[0];

        System.out.println(Arrays.toString(allWords));
        for (int i =allWords.length-1 ; i >=0; i--) {
            System.out.println();
            }
        }

    }

