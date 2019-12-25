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
            Arrays.sort(score);

            float sum=0;
            for (int i = 1; i < 6; i++) {
                 sum += score[i];
            }
            System.out.println("Enter difficulty:");
            float total= (sum*0.6f*input.nextFloat());
            // FINAL OUTPUT
            System.out.printf("Total: %.2f", total);
        }
    }

