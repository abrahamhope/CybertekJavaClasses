package day62;

import java.util.HashSet;
import java.util.Set;

public class SetInterfaceIntro {
    public static void main(String[] args) {


        Set<Integer> myNums = new HashSet<>();
        myNums.add(10);
        myNums.add(10);
        myNums.add(22);
        myNums.add(13);
        myNums.add(13);
        myNums.add(30);
        myNums.add(30);

        System.out.println(myNums);
    }
}
