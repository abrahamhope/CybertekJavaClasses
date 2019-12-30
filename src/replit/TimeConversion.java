package replit;

import java.util.Arrays;

public class TimeConversion {
    public static void timeConversion(String s) {
        /*
         * Write your code here.
         */
        String[] time= s.split(":");

        String [] amPm=time[2].split("");
        if(amPm[2].equals("P")){
            int hour=Integer.parseInt(time[0]);
            hour+=12;
            System.out.println(hour+":"+time[1]+":"+amPm[0]+amPm[1]);

        }else{
            System.out.println(time[0]+":"+time[1]+":"+amPm[0]+amPm[1]);
        }
    }

    public static void main(String[] args) {
        timeConversion("07:05:45AM");
    }
}
