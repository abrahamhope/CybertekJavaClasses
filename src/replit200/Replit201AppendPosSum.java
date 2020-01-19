package replit200;

import java.util.ArrayList;

public class Replit201AppendPosSum {
    public static void main(String[] args) {

    }

    public static ArrayList<Integer> appendPosSum(ArrayList<Integer> lst){
        ArrayList<Integer> pstvLst=new ArrayList<>();
        for (int i = 0; i < lst.size(); i++) {
            if(lst.get(i)>0){
                pstvLst.add(lst.get(i));
            }
        }
        int sum=0;
        for (int i = 0; i < pstvLst.size(); i++) {
           sum+=pstvLst.get(i);
        }
        pstvLst.add(sum);
        return pstvLst;
    }
}
