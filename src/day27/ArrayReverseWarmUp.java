package day27;

import java.util.Arrays;

public class ArrayReverseWarmUp {
    public static void main(String[] args) {
        String str="Sunday perfect day to start coding";
        String [] strArrr=str.split(" ");
        for (int i = strArrr.length-1; i >=0 ; i--) {
            System.out.print(strArrr[i]+"-");
        }
        System.out.println();
        String strRev="";
        int lastIndex =strArrr.length-1;
        for (int i = 0; i < strArrr.length/2; i++) {
            String temp=strArrr[i];
            strArrr[i]=strArrr[lastIndex-i];
            strArrr[lastIndex-i]=temp;
        }
        System.out.println(Arrays.toString(strArrr));

    }
}
