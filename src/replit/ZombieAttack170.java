package replit;

import java.util.Arrays;
import java.util.Scanner;

public class ZombieAttack170 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] inhabitants = new int[8];
        for(int i=0; i<inhabitants.length; i++) {
            inhabitants[i] = input.nextInt();
        }
        //TODO. Write you code below this line.
        //
        // 1. first find the location of the cities with "0" population
        // Print Day 0 Array.toString(inhabitants)
        // 2. divide the number by two for cities next to "0" population location and print
        // Day # and the Array.toString(inhabitants).
        // 3. check the numbers for each location after the first division to find new "0"s
        // 4. divide the numbers by two for cities next to "0" population location.
        // 5. continue step 3 and four until all numbers are "0".
        // 6. if all numbers are zero print "---- EXTINCT ----"

        int day=0;
        int temp[]=new int[8];
        int extinct[]={0, 0, 0, 0, 0, 0, 0, 0};

        do{
            System.out.println("Day " + day+" "+ Arrays.toString(inhabitants));
            for (int i = 0; i < inhabitants.length; i++) {
                temp[i]=inhabitants[i];
            }
            for (int i = 0; i < inhabitants.length; i++) {
                    if(i==0&&inhabitants[i]==0){
                        inhabitants[i+1]=temp[i+1]/2;
                    }else if(i==7&& inhabitants[inhabitants.length-1]==0){
                        inhabitants[inhabitants.length-2]=temp[inhabitants.length-2]/2;
                    }else if(temp[i]==0){
                        inhabitants[i+1]=temp[i+1]/2;
                        inhabitants[i-1]=temp[i-1]/2;
                    }
            }day++;

        }while(!Arrays.equals(inhabitants,extinct));

        System.out.println("Day " + day+" "+ Arrays.toString(inhabitants));

        System.out.println("---- EXTINCT ----");
    }
}
