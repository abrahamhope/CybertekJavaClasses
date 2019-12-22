package day11;

import java.util.Scanner;

public class Replit34 {
    public static void main(String[] args) {
         int itemPrice, quarters, dimes, nickels;
    Scanner scan=new Scanner(System.in);
    itemPrice=scan.nextInt();
    quarters=(100-itemPrice)/25;
    int remainingAfterQuarter=(100-itemPrice)%25;
    dimes=remainingAfterQuarter/10;
    int remainingAfterDimes=remainingAfterQuarter%10;
    nickels=remainingAfterDimes/5;

    if(itemPrice<25 && itemPrice>100){
        System.out.println("Invalid price!");
    }else if(itemPrice%5!=0){
        System.out.println("Invalid price!");
    }else{
        System.out.println("Your change is "+quarters+" quarters "+dimes+" dimes "+nickels+" nickels " );
    }
    }
}
