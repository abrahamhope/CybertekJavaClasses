package replit;

import java.text.DecimalFormat;

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2){
        long a= (long) (num1*1000);
        long b= (long) (num2*1000);
        if(a==b){
            return true;
        }else{
            return false;
        }

    }
}
