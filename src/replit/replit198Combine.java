package replit;

import java.util.ArrayList;

public class replit198Combine {
    public static ArrayList combineAL(ArrayList<String> wordList1, ArrayList<String> wordList2){
        ArrayList<String> combined= new ArrayList<>(wordList1.size()+wordList2.size());
        for (int i = 0; i < wordList1.size(); i++) {
            combined.add(wordList1.get(i));
        }
        for (int i = 0; i <wordList2.size() ; i++) {
            combined.add(wordList2.get(i));
        }
        return combined;
    }
}
