package day21;

public class BreakInForLoopControl {
    public static void main(String[] args) {
        /*
        store my name in a variable
        loop through each letter and print
        exit the loop if you see letter h
         */
        String myName="Abraham";

        for (int i = 0; i < myName.length(); i++) {


            if(myName.charAt(i) == 'h'){
                break;
            }
            System.out.println(myName.charAt(i));

        }
    }
}
