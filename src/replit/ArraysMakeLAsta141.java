package replit;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysMakeLAsta141 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] nums = new int[size];
        for(int i =0; i < size; i++) {
            nums[i] = scan.nextInt();
        }
        //WRITE YOUR CODE HERE

        int[] newArray=new int[size*2];
        newArray[size*2-1]=nums[size-1];
        System.out.println(Arrays.toString(newArray));
    }
}
