package replit;

import java.util.Scanner;

public class ParseJSON104 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String json = scan.nextLine();

        int fNB=json.indexOf("firstName");
        int fNE=json.indexOf(", \"lastName\":");
        String firstName=json.substring(fNB+13,fNE-1);

        int lNB=json.indexOf("lastName");
        int lNE=json.indexOf(", \"role\":");
        String lastName= json.substring(lNB+12, lNE-1);

        System.out.println("First name: "+ firstName);
        System.out.println("Last name: "+lastName);
    }
}
