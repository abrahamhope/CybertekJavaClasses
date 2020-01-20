package replit200;

import java.util.ArrayList;
import java.util.Collections;

public class Replit215TwoTimes {
    public static void main(String[] args) {
        ArrayList<Integer> arrInt=new ArrayList<>();
        arrInt.add(1);
        arrInt.add(4);
        arrInt.add(7);
        arrInt.add(12);

        System.out.println("twoTimes() = " + twoTimes(arrInt));
    }

    public static ArrayList<Integer> twoTimes(ArrayList<Integer> arrInt){
        ArrayList<Integer> newArr= new ArrayList<>();
        newArr.addAll(arrInt);
        for (int i = 0; i < newArr.size(); i+=2) {
            newArr.add(i,newArr.get(i));
        }
        return newArr;

    }
}
