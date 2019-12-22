package day27;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysCalssMethods {
    public static void main(String[] args) {
        /*
        Arrays class methods
        -toString -->return string rep of array items
        -sort() --> sorts the array
        -copyOf(arrObject, lengOfNewArr)--> ew array with length defined
        and everything copied from original
        -copyOfRange(arrObj, from, to) -->works like subString
        -equals (arr1, arr2) --> true false if elements are the same
        -binarySearch
- -         */
        String [] words ={"coding", "start", "to", "day", "perfect", "Sunday"};
        Arrays.sort(words);
        System.out.println(Arrays.toString(words));

        String [] first2words = Arrays.copyOf(words, 2);
        System.out.println(Arrays.toString(first2words));

        String [] tenItem = Arrays.copyOf(words, 10);
        System.out.println(Arrays.toString(tenItem));


        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your word to be added");
        String userWords=scan.next();

        String [] newWords =Arrays.copyOf(words, words.length+1);
//        System.out.println(Arrays.toString(newWords));

        int lastSpotIndex= newWords.length-1;
        newWords[lastSpotIndex] = userWords;
        System.out.println(Arrays.toString(newWords));



    }

}
