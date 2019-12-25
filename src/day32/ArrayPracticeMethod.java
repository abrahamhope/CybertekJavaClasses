package day32;

public class ArrayPracticeMethod {
    public static void printMaxOfIntArray(int[] nums){
        int max=nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (max<nums[i]){
                max=nums[i];
            }
        }
        System.out.println("max = " + max);
    }
    public static void printMinOfIntArray(int[] nums){
        int min=nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (min>nums[i]){
                min=nums[i];
            }
        }
        System.out.println("min = " + min);
    }
    public static void printSumOfIntArray(int[] nums){
        int sum=0;
        for (int each:nums){
            sum+=each;
        }
        System.out.println("sum = " + sum);
    }
    public static void main(String[] args) {
        int [] scores={10, 45, 85, 96, 38, 78, 45, 124};
printMaxOfIntArray(scores);
printMinOfIntArray(scores);
printSumOfIntArray(scores);
    }
}
