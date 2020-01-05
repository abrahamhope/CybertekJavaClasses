package replit;

import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        isPalindrome(num);
    }

    public static void isPalindrome(int num){
        //WRITE YOUR CODE HERE
    int reversed=0,
    originalInt=num,r;
    boolean isPalindrome=true;
        do {
             r=num%10;
            reversed=reversed*10+r;
            num/=10;
        }
        while(num>0);

        if(originalInt==reversed){
            System.out.println(isPalindrome);
        }else {
            System.out.println(!isPalindrome);

        }
    }
}
