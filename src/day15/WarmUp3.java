package day15;

import java.util.Scanner;

public class WarmUp3 {
    public static void main(String[] args) {

        String name="isaac";
        System.out.print( name.charAt(4)   );
        System.out.print( name.charAt(3)   );
        System.out.print( name.charAt(2)   );
        System.out.print( name.charAt(1)   );
        System.out.print( name.charAt(0)   );


        int characterCount = name.length();
        int lastCharIndex = characterCount-1;
        char lastChar= name.charAt(lastCharIndex);
        System.out.println(lastChar);
    }
}
