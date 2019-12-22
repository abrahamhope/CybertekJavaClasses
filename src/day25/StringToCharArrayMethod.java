package day25;

import java.util.Arrays;

public class StringToCharArrayMethod {
    public static void main(String[] args) {
        String name="Alesya";
        //how would oyu store each and every character
        // to a char array from above name
        // without using method we are about to learn

        char[] nameChar= new char[name.length()];
//        nameChar[0]=name.charAt(0);
//        nameChar[1]=name.charAt(1);

        for (int x = 0; x < nameChar.length; x++) {
            nameChar[x]=name.charAt(x);
        }
        System.out.println("Arrays.toString(nameChar) = " + Arrays.toString(nameChar));

        char [] nameChar2= name.toCharArray();
        System.out.println("nameChar2 = " + Arrays.toString(nameChar2));

    }
}
