package day11;

import java.util.Scanner;

public class Logicals {
    public static void main(String[] args) {
        System.out.println("Truth Table");
        System.out.println("Result of true && true is "+ (true && true));
        System.out.println("Result of false && true is "+ (false && true));
        System.out.println("Result of true && false is "+ (true && false));
        System.out.println("Result of false && false is "+ (false && false));
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();

        System.out.println(num >100 || num<10);
        System.out.println(num>10 && num<60);

    }
}
