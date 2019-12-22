package day11;

import java.util.Scanner;

public class WakeUpTask {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String outcome = "";
        String targetOption = scan.next();

        switch (targetOption) {
            case "Bd":
                outcome = "You have turned on bedroom light";
                break;
            case "Lr":
                outcome = "You have turned on living room light";
                break;
            case "Ki":
                outcome = "You have turned on kitchen light";
                break;
            case "Ha":
                outcome = "You have turned on Hallway light";
                break;
            default:
                outcome="There is no such light";
}
        System.out.println(outcome);
    }
}
