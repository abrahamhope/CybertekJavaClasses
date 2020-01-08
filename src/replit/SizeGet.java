package replit;

import java.util.ArrayList;

public class SizeGet {
    public static int sum(ArrayList<Integer> ints)
    {
        //write code here
        int sum=0;
        for (int i = 0; i < ints.size(); i++) {
            sum+=ints.get(i);
        }
        return sum;
    }
}
