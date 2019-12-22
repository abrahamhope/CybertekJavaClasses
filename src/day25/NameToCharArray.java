package day25;

import java.util.Arrays;

public class NameToCharArray {
    public static void main(String[] args) {
        String name="Abraham";

        char [] nameChar=name.toCharArray();

        for  (char eachChar : nameChar) {
            System.out.println("eachChar = " + eachChar);
        }

        Arrays.sort((nameChar));
        System.out.println("nameChar = " + Arrays.toString(nameChar));

    }
}
