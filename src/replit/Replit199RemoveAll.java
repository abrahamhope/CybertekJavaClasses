package replit;

import java.util.ArrayList;

public class Replit199RemoveAll {
    public static ArrayList combineAL(ArrayList<String> wordList, String targetWord){

        for (int i = 0; i < wordList.size(); i++) {
            if(wordList.get(i).equals(targetWord)) {
                wordList.remove(i);
            }
        }
        return wordList;
    }
}
