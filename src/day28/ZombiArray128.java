package day28;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ZombiArray128 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] inhabitants = new int[8];
        for(int i=0; i<inhabitants.length; i++) {
            inhabitants[i] = input.nextInt();
        }

        //TODO. Write you code below this line.
        // divide each index of the string by two
        // continue dividing until each index is equal to 0
        for (int j = 0; j < inhabitants.length; j++) {
            System.out.println("Day " + j + " " + Arrays.toString(inhabitants));
            while (inhabitants[j] != 0) {
                for (int k = j; k < inhabitants.length; k++) {
                    inhabitants[k] /= 2;
                }
            }

        }
        System.out.println("---- EXTINCT ----");









    }
}
