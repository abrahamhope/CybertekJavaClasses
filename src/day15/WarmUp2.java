package day15;

import java.util.Scanner;

public class WarmUp2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your first name:");
        String name=scan.next();

        if(name.contains("a") || name.contains("e")){
            System.out.println("Name contains a or e");
        }else{
            System.out.println("My mane don't have bot a and e");
        }

    }
}
