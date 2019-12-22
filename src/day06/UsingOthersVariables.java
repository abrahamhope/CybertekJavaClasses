package day06;

import java.util.Scanner;

public class UsingOthersVariables {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("What is your order? I want the same");
        String yourOrder= scan.nextLine();
        String myOrder=yourOrder;
        System.out.println("Your Order "+myOrder+"\n"+"My Order "+ yourOrder);

    }
}
