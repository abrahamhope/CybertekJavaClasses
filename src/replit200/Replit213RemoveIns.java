package replit200;

import java.util.ArrayList;

public class Replit213RemoveIns {
    public static ArrayList<Integer> removeInst(ArrayList<Integer> r, Integer n) {
        for (int i = r.size()-1; i >=0 ; i--) {
            if(r.get(i)==n){
                r.remove(i);
            }
        }
        return r;
    }
}
