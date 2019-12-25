package replit;

import java.util.Arrays;
import java.util.Scanner;

public class Array2DLargestNumber142 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int rows = inp.nextInt(), cols = inp.nextInt();
        int[][] arr = {{1,3},{5,7},{9,12},{2,8},{7,13}};
        for(int i=0 ;i<=rows-1;i++)
        {
            for(int j=0 ;j<=cols-1;j++)
            {
                arr[i][j]=inp.nextInt();
            }//end for cols
        }//end for rows


        //TODO write your code below
        int max=arr[0][0];
        for(int i=0 ;i<=rows-1;i++) {
            for(int j=0 ;j<=cols-1;j++){
                if(arr[i][j]>arr[0][0]){
                    max=arr[i][j];
                }
            }//end for cols
        }//end for rows
        System.out.println(max);
    }
}
