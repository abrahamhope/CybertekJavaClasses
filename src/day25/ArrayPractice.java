package day25;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        // given an array check if this array is already sorted

//        int[] nums = {13,31,8,21,5,85,2};
        int [] nums= {1,2,3,4,5,6};
        int numsSize= nums.length;
        //I want to copy the content of the nums array into the new array
        int[] temp = new int[numsSize];
        for (int i = 0; i < numsSize; i++) {
            temp[i]=nums[i];
        }
        System.out.println("Temp Array"+Arrays.toString(temp));

        Arrays.sort(nums);
        System.out.println("nums Array After Sorting= " +Arrays.toString(nums));

        if(Arrays.equals(nums,temp)){
            System.out.println("THIS ARRAY IS ALREADY SORTED");
        }else {
            System.out.println("THIS ARRAY IS NOT ALREADY SORTED");

        }
    }
}
