package day24;

public class ForEachLoopReadOnly {
    public static void main(String[] args) {
        int yourFavNumber = 300;
        int myFavNumber = yourFavNumber;

        long [] nums = {10,40,20};
//        nums[0]*=2;
//        System.out.println(nums[0]);

        // NEVER USE FOR EACH LOOP TO MODIFY ARRAY ITEMS
        //FOR EACH WILL NEVER MODIFY ANYWAYS. Changing the copy doesn't change the original

        for (int x = 0; x < 3; x++) {

            System.out.println(nums[x]);
        }
    }
}
