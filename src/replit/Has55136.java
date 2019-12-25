package replit;

import java.util.Scanner;

public class Has55136 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        //TODO Type your code below:
       boolean isTrue=false;
        for (int i = 0; i < nums.length; i++) {
            if(i != nums.length - 1 && nums[i]==5 && nums[i+1]==5){
                isTrue=true;
                break;
            }
        }
        System.out.println(isTrue);
    }
}
