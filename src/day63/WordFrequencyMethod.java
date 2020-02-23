package day63;

import java.util.HashMap;
import java.util.Map;

public class WordFrequencyMethod {
    public static void main(String[] args) {


        String str = "Fun Fun Fun Java Java is Ending Tomorrow Tomorrow No It is never Ending";

        System.out.println("getFrequencyMap(str) = " + getFrequencyMap(str));

    }

    // WHY STATIC? SO I CAN CALL IT DIRECTLY IN THE MAIN METHOD TO TEST
    // IF IT IS NOT STATIC, I NEED TO CREATE AN OBJECT THEN CALL IT
    // VOID DOESN'T RETURN
    public static Map<String, Integer> getFrequencyMap(String str) {

        Map<String, Integer> wordFreqMap = new HashMap<>();
        String[] allWords = str.split(" ");

        for (String word : allWords) {
            if (!wordFreqMap.containsKey(word)) {
                wordFreqMap.put(word, 1);
            } else {
                wordFreqMap.replace(word, wordFreqMap.get(word) + 1);
            }
        }
        return wordFreqMap;
    }


}
