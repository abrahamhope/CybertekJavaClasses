package replit;

import java.util.Scanner;

public class ShortestWordInArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] str = {scan.next(), scan.next(), scan.next(),
                scan.next(), scan.next(), scan.next()};
        //check if the first item in the array is longer than the next item.
        //keep the current item if it is shorter
        //keep the next item if it is shorter
        //continue until the end
        //print the shortest item
        String shortestWord=str[0];
        for (int i = 0; i < str.length; i++) {
           if(str[0].length()>str[i].length()){
               shortestWord=str[i];
           }
        }
        System.out.println(shortestWord);
    }
}
