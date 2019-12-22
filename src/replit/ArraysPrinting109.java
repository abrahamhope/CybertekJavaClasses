package replit;


import java.util.Arrays;
import java.util.Scanner;

public class ArraysPrinting109 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        //TODO: write your code below
        int res=nums[0];
        for (int i = 1; i < 7; i++) {
         res=res^nums[i];
        }
        System.out.println(res);

    }
}

