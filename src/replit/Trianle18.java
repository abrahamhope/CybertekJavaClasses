package replit;

import java.util.Scanner;

public class Trianle18 {
    public static void main(String[] args) {
        int i = 1;
        int j = 1;
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int k = 0; k < n; k++) {

            for (int m = 0; m <= k; m++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
