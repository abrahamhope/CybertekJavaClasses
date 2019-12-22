package replit;

import java.util.Scanner;

public class EqualsJava {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();
        //code starts here

        int countJava = 0;
        int countPython = 0;
        for (int i=0; i<sentence.length(); i++) {
            if (sentence.substring(i).startsWith("java")) {
                countJava++;
            }
            else if (sentence.substring(i).startsWith("python")) {
                countPython++;
            }
        }
        System.out.println(countJava==countPython);


    }
}
