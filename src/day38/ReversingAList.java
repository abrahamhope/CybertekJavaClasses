package day38;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReversingAList {
    public static void main(String[] args) {
        List<Integer> nums1= new ArrayList<>(Arrays.asList(200,100,700,400,500));
        System.out.println("nums1 = " + nums1);
        // after reversing
        // 500, 400, 700, 100, 200
        Collections.reverse(nums1);
        System.out.println("nums1 = " + nums1);

        // after sorting in reverse order
        // 700, 500, 400, 200, 100
        Collections.sort(nums1,Collections.reverseOrder());
        System.out.println("nums1 after sorting reverse order = " + nums1);

    }
}
