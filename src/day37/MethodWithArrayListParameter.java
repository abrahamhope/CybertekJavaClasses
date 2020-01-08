package day37;

import java.util.ArrayList;

public class MethodWithArrayListParameter {
    public static void main(String[] args) {
        ArrayList<String> nameLst =new ArrayList<String>();
        nameLst.add("Qalbinur");
        nameLst.add("Ruzi");
        nameLst.add("Sabahiddin");
        nameLst.add("Guzelnur");
        nameLst.add("Muyesser");
        nameLst.add("Mustafa");

        arrayListPrinter(nameLst);
    }
    // Create a method that accept a List of String as argument
// same thing as a method that has List of String parameter
// and print out each and every item in the list vertically
// return nothing

    /**
     * This method will print out the content of passed list object
     * @param lst of String
     * @return nothing
     */
    public static void arrayListPrinter(ArrayList<String> lst){
        for (String each : lst) {
            System.out.println("each = " + each);
        }    }
}
