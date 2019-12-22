package day24;

import java.util.Arrays;

public class ArrayMethodsSorting {
    public static void main(String[] args) {
        int[] scores = {99, 44, 66, 23, 19, 55};

        Arrays.sort(scores);
        System.out.println(Arrays.toString(scores));


        char[] nameChars= {'G','A', 'D', 'Z', 'C', 'A'};
        System.out.println("nameChars = " + nameChars);

        Arrays.sort(nameChars);

        System.out.println("After Sorting nameChars = " + nameChars);
    }
}
