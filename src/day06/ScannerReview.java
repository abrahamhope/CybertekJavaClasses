package day06;

import java.util.Scanner;

public class ScannerReview {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the regular price and discount");
double regularPrice=scan.nextDouble();
double discount=scan.nextDouble();
        double salePrice= regularPrice-(regularPrice*discount);
        System.out.println("Your sale price: "+ salePrice);

    }
}
