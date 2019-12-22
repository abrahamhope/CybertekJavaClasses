package day11;

import java.util.Scanner;

public class ReplitSample {
        public static void main(String[] args) {
            //ENTER CODE HERE
            Scanner input = new Scanner(System.in);
            System.out.println("Enter price in cents:");
            int money= input.nextInt();
            boolean correct = money%5==0;
            if((money >= 25 && money <=100)&& correct){
                int change = 100-money;
                int quarter = change/25;
                int dime = (change%25)/10;
                int nickles = ((change%25)%10)/5;
                System.out.println("Your change is " +quarter +" quarters, "+
                        dime+ " dimes, and "+nickles+ " nickels.");
            }else{
                System.out.println("Invalid price!");
            }

        }
    }

