package day37;

import java.util.ArrayList;
import java.util.List;

public class ListPracticeWithLoop {
    public static void main(String[] args) {
        
        /*
        create an ArrayList of Integer and fill it up with 1-100
         */
        List<Integer> numList= new ArrayList<>();

        for (int eachNumber = 1; eachNumber < 101; eachNumber++) {
        numList.add(eachNumber);
        }
        System.out.println("numList = " + numList);

        // change all the odd number value to 0

        for (int i = 0; i < 100; i+=2) {
                numList.set(i,0);
        }
        System.out.println("Num List after making odd numbers 0 = "+numList);

        numList.add(0,100);
        System.out.println("after adding an item to first location"+numList);
        System.out.println("Index of 20 after inserting 100 at index 0 = "+numList.indexOf(20));

        List<Integer> lst2 = new ArrayList<>();
        lst2.add(44);
        lst2.add(14);
        lst2.add(34);
        lst2.add(41);
        lst2.add(19);
        // insert 100 right after 34 : WE DO NOT KNOW WHERE IS 34 :

        System.out.println("lst2 = " + lst2);

    }
}
