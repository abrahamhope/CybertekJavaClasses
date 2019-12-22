package day12;

import java.util.Scanner;

public class replit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String item = scan.nextLine();

        //WRITE YOUR CODE HERE
        int balance;
        if (item.equals("Hat")){
            System.out.println("Thank you for your purchase");
            balance=100-25;
            System.out.println("Your current balance is: "+balance);
        }else if(item.equals("Pillow")){
            System.out.println("Thank you for your purchase");
            balance=100-40;
            System.out.println("Your current balance is: "+balance);
        }else if(item.equals("Blanket")){
            System.out.println("Thank you for your purchase");
            balance=100-60;
            System.out.println("Your current balance is: "+balance);
        }else if(item.equals("Socks")){
            System.out.println("Thank you for your purchase");
            balance=100-5;
            System.out.println("Your current balance is: "+balance);
        }else if(item.equals("Headphones")){
            System.out.println("Thank you for your purchase");
            balance=100-30;
            System.out.println("Your current balance is: "+balance);
        }else if(item.equals("Pants")){
            System.out.println("Thank you for your purchase");
            balance=100-50;
            System.out.println("Your current balance is: "+balance);
        }else if(item.equals("USB Cable")){
            System.out.println("Thank you for your purchase");
            balance=100-10;
            System.out.println("Your current balance is: "+balance);
        }else if(item.equals("Charger")){
            System.out.println("Thank you for your purchase");
            balance=100-15;
            System.out.println("Your current balance is: "+balance);
        }else if(item.equals("Smartphone")){
            System.out.println("Thank you for your purchase");
            balance=100-300;
            System.out.println("Sorry, not enough funds on your gift card!");
        }else if(item.equals("Laptop")){
            System.out.println("Thank you for your purchase");
            balance=100-400;
            System.out.println("Sorry, not enough funds on your gift card!");
        }else{
            System.out.println("Invalid item!");
        }
    }
}
