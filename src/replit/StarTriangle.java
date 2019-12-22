package replit;

import java.util.Scanner;

public class StarTriangle {
    public static void main(String[] args) {
        int i = 1;
        int j = 1;
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String box="";
        for(i=0; i<=n ; i++){
            System.out.println(box);
            box=box + " *";
        }
    }
}
