package day11;

import java.util.Scanner;

public class WakeUpTaskIf {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String outcome = "";
        String targetOption = scan.next();

        if (targetOption=="Bd") {
            outcome = "You have turned on bedroom light";
        }else if (targetOption=="Lr") {
            outcome = "You have turned on living room light";
        }else if (targetOption=="Ki") {
            outcome = "You have turned on kitchen light";
        }else if (targetOption=="Ha") {
            outcome = "You have turned on Hallway light";
        }else{
                outcome="There is no such light";
}
        System.out.println(outcome);
    }
}
