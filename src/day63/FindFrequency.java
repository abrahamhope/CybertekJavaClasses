package day63;

import javax.crypto.spec.PSource;
import java.util.HashMap;
import java.util.Map;

public class FindFrequency {
    public static void main(String[] args) {
        String str = "AAABBBBBBACCRDDD";
        // Get the frequency and store into map   <Character, Integer>
        // if we do not have the character
        // we will enter character in char column
        // and enter the count as 1

        // if we have the character
        // increase the existing count by 1
        // and replace the value with new value
        Map<Character,Integer> charFreq = new HashMap<>();

        for (int x = 0; x < str.length(); x++) {

            char currentChar = str.charAt(x);
            // if we don't have the key yet, we are entering for the first time.
            // the count will be 1
            if(!charFreq.containsKey(currentChar)){
                System.out.println("Enter for the first time "+currentChar );
                charFreq.putIfAbsent(currentChar,1);
            }else{
                // if we come to this point, it means it has already sbowed up.
                // so we update the count with adding 1 to existing count
                charFreq.replace(currentChar,charFreq.get(currentChar)+1);
            }
        }

        System.out.println("charFreq = " + charFreq);




    }
}
