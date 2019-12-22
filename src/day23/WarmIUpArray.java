package day23;

public class WarmIUpArray {
    public static void main(String[] args) {
        /*
        //  create an int array of 7 items
//  assign values
// 1,  print out in reverse order
// 2 , store last item in a variable called lastItem
            // print it out separately
// 3 , print the item right in the middle
//
// OPTIONALLY : find sum , find average , find max , find min
         */
        int[] nums={2,6,7,23,35,6,7};
        int sum=0;
        int sumEven=0;
        int sumOdd=0;

        for (int i = 6; i >=0 ; i--) {
            System.out.println("nums = " + nums[i]);
        }
        int lastItem= nums[6];
        System.out.println("lastItem = " + lastItem);

        System.out.println("Middle number= "+nums[3]);

        for (int i = 0; i <7; i++) {
            sum+=nums[i];
        }
        System.out.println("sum = " + sum);

        int average=sum/nums.length;
        System.out.println("average = " + average);


        for (int i = 0; i <7; i++) {
            if(nums[i]%2==0){
                sumEven+=nums[i];
            }
        }
        System.out.println("sumEven = " + sumEven);

        for (int i = 0; i <7; i++) {
            if(nums[i]%2!=0){
                sumOdd+=nums[i];
            }
        }
        System.out.println("sumOdd = " + sumOdd);

        int max = nums[0];
        for (int i = 0; i <nums.length-1 ; i++) {
            if(nums[i]>max){
            max=nums[i];
            }
        }
        System.out.println("max = " + max);

        int min = nums[0];
        for (int i = 0; i <nums.length-1 ; i++) {
            if(nums[i]<min){
                min=nums[i];
            }
        }
        System.out.println("min = " + min);

    }
}
