package day16;

import java.util.Scanner;

public class StringPractice {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        String keywordToSearch = scan.nextLine(); //"Java";

        String tabTitle =  keywordToSearch + " - Google Search";

        if( tabTitle.startsWith( keywordToSearch )  && tabTitle.endsWith(" - Google Search")  ){
            System.out.println("Test Passes");
        }else {
            System.out.println("Test Failed");
        }
    }
}
