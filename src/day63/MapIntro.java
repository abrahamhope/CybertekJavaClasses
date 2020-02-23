package day63;

import java.util.HashMap;
import java.util.Map;

public class MapIntro {
    public static void main(String[] args) {
        // Compared to List, Set which store single element per item
        // Map store key-value pair per item
        // That's why we need two data types inside <>
        // one for the key and one for the value

        Map<String, Integer> nameAndAgePair = new HashMap<>();

        // adding elements : put
        nameAndAgePair.put("Zehra",6);
        nameAndAgePair.put("Muhammed", 21);
        nameAndAgePair.put("Maiia", 27);
        nameAndAgePair.put("Aidar", 20);
        nameAndAgePair.put("Faith", 27);
        nameAndAgePair.put("Ruhksona", 16);

        // The keys of the Map are unique, it doesn't accept duplicate
        // here since we already have Zehra --> it will just replace the old value with new one
        nameAndAgePair.put("Zehra",7);

        // how to I only add new items if it does not already exist
        nameAndAgePair.putIfAbsent("Zehra", 10);

        System.out.println("nameAndAgePair = " + nameAndAgePair);

        //getting the size of a map
        System.out.println("nameAndAgePair.size() = " + nameAndAgePair.size());

        // how do we get a value accordinf to the key
        System.out.println("nameAndAgePair.get(\"Zehra\") = " + nameAndAgePair.get("Zehra"));

        // how to I check a key already exist or not
        System.out.println("nameAndAgePair.containsKey(\"Ruhksona\") = " + nameAndAgePair.containsKey("Ruhksona"));


        // updating the element in the Map using replace
        nameAndAgePair.replace("Maiia", 17);
        System.out.println("nameAndAgePair = " + nameAndAgePair.get("Maiia"));
    }

}
