package day15;

import java.util.Scanner;

public class replit_terniary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    System.out.println("Enter number:");
		int x = scan.nextInt();
		//WRITE YOUT CODE HERE
boolean isGreaterThan5= x>=5;

String action= (isGreaterThan5) ? (""+x) : ("-"+x);
		System.out.println(action);
    }
}
