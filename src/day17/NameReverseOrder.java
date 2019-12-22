package day17;

import java.util.Scanner;

public class NameReverseOrder {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your name below to print it in reverse");
        String name=scan.nextLine();
        int x=name.length()-1;

        while(x>= 0){
            System.out.print(name.charAt(x)+"");
            --x;
        }
    }
}
