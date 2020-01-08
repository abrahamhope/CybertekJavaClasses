package day37;

import java.util.ArrayList;

public class LongestName {
    public static void main(String[] args) {
        ArrayList<String> nameLst =new ArrayList<String>();
        nameLst.add("Qalbinur");
        nameLst.add("Ruzi");
        nameLst.add("Sabahiddin");
        nameLst.add("Guzelnur");
        nameLst.add("Muyesser");
        nameLst.add("Mustafa");

        String longestName= nameLst.get(0);
        for (int i = 0; i < nameLst.size(); i++) {
            if(longestName.length()<nameLst.get(i).length()){
                longestName= nameLst.get(i);
            }
        }
        System.out.println(longestName);
// length     :  counting the elements inside array , it's a property of array object
            // last element of an array :  arr[arr.length-1]
// length()   :  counting the characters inside String , it's a method of String object
            // last char of a String :  str.charAt( str.length-1 )
// size()     :  counting the elements inside ArrayList object, , it's a method of List Object
            // last element of an arrayList :  lst.get( lst.size()-1 )
    }
}
