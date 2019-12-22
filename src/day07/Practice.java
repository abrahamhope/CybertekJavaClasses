package day07;

import java.util.Scanner;
public class Practice {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String firstName=s.next();
        String lastName=s.next();
        String company=s.next();
        String email=firstName+"_"+lastName+"@"+company+".com";
        System.out.println(email);
    }
}
