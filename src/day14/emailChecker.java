package day14;

import java.util.Scanner;

public class emailChecker {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your email to find out your provider:");
        String email=scan.next();
        boolean mustContain= email.contains("@");
        boolean mustNotContain = ! email.contains(" ");
        boolean endWithGmail= email.endsWith("@gmail.com");
        boolean endWithYahoo= email.endsWith("@yahoo.com");
        boolean endWithRu= email.endsWith("@mail.ru");

        if (mustContain && mustNotContain){
            if(endWithGmail){
                System.out.println("Gmail");
            }else if(endWithYahoo){
                System.out.println("Yahoo");
            }else if(endWithRu){
                System.out.println("Mail Ru");
            }
        }else{
            System.out.println("Invalid Email");
        }
    }
}
