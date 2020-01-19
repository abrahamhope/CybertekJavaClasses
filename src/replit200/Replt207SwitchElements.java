package replit200;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Replt207SwitchElements {
    public static int[] do_switch(int[] i) {
       int temp=i[i.length-1];
       i[i.length-1]=i[0];
       i[0]=temp;
       return i;
        }
    }

