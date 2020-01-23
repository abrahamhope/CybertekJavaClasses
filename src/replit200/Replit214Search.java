package replit200;

import java.util.ArrayList;

public class Replit214Search {
    public static String search(ArrayList<String> r, String find) {
        // we will loop each element of the array to check if it contains the String find
        // we will than return the element that contains String find

        for(String each:r){
            if(each.contains(find)){
                return each;
            }
        }
        return "search failed";

    }//end wineSeller
}
