package day37;

import java.util.ArrayList;
import java.util.List;

public class ArrayListWithRemovePractice {
    public static void main(String[] args) {
        List<Integer> lst2 = new ArrayList<>();
        lst2.add(2);
        lst2.add(44);
        lst2.add(14);
        lst2.add(34);
        lst2.add(41);
        lst2.add(19);

//        lst2.remove(2);
        //I want to remove the item by value not index.
        lst2.remove(new Integer(2));
        System.out.println("lst2 = " + lst2);
    }
}
