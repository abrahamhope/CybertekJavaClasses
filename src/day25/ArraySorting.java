package day25;

public class ArraySorting {
    public static void main(String[] args) {
        int [] nums={2,4,6,23,12,5};

        boolean isSortedAlready = true;

        for (int i = 0; i < nums.length-1; i++) {
            if(!(nums[i]<nums[i+1])){
                System.out.println("This array is not sorted");
                isSortedAlready=false;
                break;
            }
        }
        System.out.println("isSortedAlready = " + isSortedAlready);

    }
}
