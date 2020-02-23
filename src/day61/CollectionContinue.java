package day61;

import java.util.*;

public class CollectionContinue {

    public static void main(String[] args) {
        Collection<Integer> num = new ArrayList<>();
        num.addAll(Arrays.asList(1,6,4,5,7,8));


        List<Integer> nums = new ArrayList<>(Arrays.asList(1,6,4,5,7,8));
        // I wantto sort this list
        Collections.sort(nums);
        System.out.println("nums = " + nums);



    }



}
