package day36;

import java.util.ArrayList;
import java.util.List;

public class ArrayListIntro {

    public static void main(String[] args) {
        // How do we create an ArrayList Object?
        ArrayList<String> lst1 = new ArrayList<>();

        // list only stores objects not primitives
        // correct way to create arraylist  object that stores whole number
        // is to user Wrapper class type. Primitive type is forbidden

        ArrayList<Integer> lst2= new ArrayList<>();
        ArrayList<Long> lst3= new ArrayList<>();
        ArrayList<Double> lst4= new ArrayList<>();

        //Optionally you can create in this way.
        List<String> myLst = new ArrayList<>();


    }
}
