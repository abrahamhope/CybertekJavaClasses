package day36;


import java.util.*;

public class MethodPractice2 {
    public static void main(String[] args) {

        long [] myLongs= {6L, 11L, 44L, 32L, 65L};
        System.out.println("Before swap myLongs "+ Arrays.toString(myLongs));
        swapFirstAneLastValue(myLongs);
        System.out.println("Before swap myLongs "+ Arrays.toString(myLongs));

    }

    /**
     * swap first and last value of long array
     * @param nums long array
     */
    public  static void swapFirstAneLastValue(long [] nums){
        long temp = nums[0];
        nums [0] = nums[nums.length-1];
        nums [nums.length-1]=temp;
    }
}
