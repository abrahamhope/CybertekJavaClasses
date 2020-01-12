package day38;

import java.util.Arrays;
import java.util.List;

public class ArrayListReview {
    public static void main(String[] args) {
        List<Double> prices= Arrays.asList(9.99, 5.55, 3.76,8.99,0.99,65.67);
        //we cannot add or remove from this type of an error.
        int count=0;
        for (Double each: prices ){
            if(each>5){
                ++count;
            }

        }System.out.println("count = " + count);
    }
// remove method will remove the first
}
