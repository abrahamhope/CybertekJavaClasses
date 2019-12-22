package replit;

import java.util.Scanner;

public class Html102 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String html = scan.nextLine();

        int begin= html.indexOf("=\"");
        int end= html.lastIndexOf("\"");

        String id="";
       if(html.contains("<html>")){
           System.out.println(html.substring(begin+2,end));
       }else{
           System.out.println("Invalid input!");
       }


    }
}
