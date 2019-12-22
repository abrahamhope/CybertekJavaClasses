package replit;

import java.util.Arrays;
import java.util.Enumeration;

public class FewWords129 {
    public static void main(String[] args) {

        System.out.println("-----EXAMPLE RUN ---------");
        String[] numbers = {"zero", "one", "two","three","four"};
        System.out.println(Arrays.toString(getWithE(numbers)));

    }

    public static String[] getWithE(String[] arr) {

        //TODO : YOUR CODE GOES HERE ----------------------
        int count=0;
        String contains="";
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i].contains("e")){
                count++;
                contains+=arr[i]+" ";
            }
        }
        String fewValues[]=contains.split(" ");

        System.out.println(Arrays.toString(fewValues));


        //YOUR CODE ENDS HERE -----------------------

        return fewValues;
    }
}
