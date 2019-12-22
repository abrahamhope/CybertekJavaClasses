package day27;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int [] nums = {1,3,5,2,6,8};
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
// array must be sorted to get a correct result

        int index = Arrays.binarySearch(nums, 5);
        System.out.println(index);

        int idx20 = Arrays.binarySearch(nums, 8);
        System.out.println(idx20);


    }
}
