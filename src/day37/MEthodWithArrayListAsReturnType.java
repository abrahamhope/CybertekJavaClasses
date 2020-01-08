package day37;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class MEthodWithArrayListAsReturnType {
    public static void main(String[] args) {


    }

    //create a method that accept a finalMumber as int
    //return an ArrayList of Integer containing numbers
    //starting from 1 till finalNumber
    public static List<Integer> getListFrom1ToFinalNumber(int finalNumber){
        List<Integer> nums= new ArrayList<>();
        for (int i = 1; i <= finalNumber; i++) {
            nums.add(i);
        }
        return nums;
    }

}
