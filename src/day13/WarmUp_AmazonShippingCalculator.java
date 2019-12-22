package day13;

import java.util.Scanner;

public class WarmUp_AmazonShippingCalculator {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your user type (prime or no member)");
        String userType=scan.nextLine();
        System.out.println("Enter the purchase amount");
        double purchaseAmount=scan.nextInt();
double shippingFee=5;
double total=shippingFee+purchaseAmount;
        if(userType.equalsIgnoreCase("prime")){
            System.out.println("The shipping cost is free");
            System.out.println("Your total is: "+purchaseAmount);
        }else if (!userType.equalsIgnoreCase("prime")&& purchaseAmount>=25){
            System.out.println("The shipping cost is free");
            System.out.println("Your total is: "+purchaseAmount);

        }else if (!userType.equalsIgnoreCase("prime")&& purchaseAmount<25){
            System.out.println("The shipping cost is $5");
            System.out.println("Your total is: "+total);

        }
    }
}
