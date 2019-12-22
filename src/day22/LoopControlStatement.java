package day22;

public class LoopControlStatement {
    public static void main(String[] args) {
        /*
        Store this sentence in a variable msg
I struggle with Java I Like Java I love Java Everything is Awesome!
loop through each and every letter
1, print every other letter
 meaning : skip a letter each time you go through the letter
	0123456789
	I struggle with  -->> Isrgl ih
	USE CONTINUE FOR THIS TASK
2,  when you reach letter a break the loop
OTIONALLY ; BREAK WHEN YOU SEE 3RD A case insensitve
         */
        String msg="I struggle with Java I Like Java I love Java Everything is Awesome!";
        int charCount= msg.length();
        System.out.println("charCount = " + charCount);

//
//        for (int i = 0; i <msg.length() ; i++) {
//
//            if(i%2==1){
//                continue;
//            }
//            System.out.print(msg.substring(i,i+1));
//        }
//        System.out.println();

        for (int i = 0; i <msg.length() ; i++) {
       // this is the code to skip if odd number index letter
        if(i%2==1){
            continue;
            }
            // this code is to break the loop when reached v
            String currentChar = msg.substring(i,i+1);
        if(currentChar.equalsIgnoreCase("v")){
            break;
        }
            System.out.print(currentChar);
        }
    }
}
