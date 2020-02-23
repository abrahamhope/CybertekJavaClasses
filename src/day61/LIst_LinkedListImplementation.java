package day61;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LIst_LinkedListImplementation {

    public static void main(String[] args) {

//        List<String> lst = new ArrayList<>();
        List<String> lst = new LinkedList<>();
        lst.add("Zeynep");
        lst.add("Ershat");
        lst.add("Kamira");
        lst.add("Sabira");
        System.out.println("lst = " + lst);

        // only difference of the linkedlist from list is the performance
        // LinkedList is backed bu something called nNode
        // see it as 4 people holding hands.
        // the neighboring person have a pointer to previous and next person
        // because they are holding hands.


        lst.remove("Ershat");
        System.out.println("lst = " + lst);


    }

}
