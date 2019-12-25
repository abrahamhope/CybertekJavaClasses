package replit;

import java.util.Arrays;
import java.util.Scanner;

public class SplitInfo153 {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("enter number");
        int num = inp.nextInt();
        next3(num);

    }

    public static void next3(int num){
        for (int i = 0; i <2 ; i++) {
            num++;
            System.out.print(num+" ");
        }
        System.out.print(num+1);

    }

}
