package day25;

import java.util.Arrays;

public class StringSplitMethod {
    public static void main(String[] args) {
        String sentence="I love Java";
        String [] allWords = sentence.split(" ");
        System.out.println(Arrays.toString(allWords));

        System.out.println("Last word in this sentence is "+allWords[allWords.length-1]);

        String sentence2= " Everything is awesome!!!";
        String [] splitBy_is_Arr= sentence2.split("is");
        for ( String eachPiece:splitBy_is_Arr) {
            System.out.println("eachPiece = " + eachPiece);
        }
    }
}
