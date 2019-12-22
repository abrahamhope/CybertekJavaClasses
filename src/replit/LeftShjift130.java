package replit;

import java.util.Arrays;
import java.util.Scanner;

public class LeftShjift130 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            float[] score = new float[7];
            //WRITE YOUR CODE HERE
            for(int i = 1; i < 8; i++) {
                System.out.println("Enter score for judge "+i+":");
                score[i] = input.nextFloat();
            }

            float sum=0;
            for (int x = 1; x < 6; x++) {
                 sum+=score[x];
            }
            System.out.println(sum);
//            System.out.println("Enter difficulty:");
//            float difficulty=input.nextFloat();
//            float total= (float) (sum*0.6*difficulty);
            // FINAL OUTPUT
            System.out.printf("Total: %.2f", total);
        }
    }

