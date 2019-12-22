package day21;

public class WarmUpNameLoop {
    public static void main(String[] args) {


//        while(x<myName.length()){
//            System.out.print(myName.charAt(x)+"->");
//            x++;
//        }
//        int x=0;
//        while(x<myName.length()-1){
//            System.out.print(myName.substring(x,(x+2))+"->");
//            x++;
//        }
        String myName="isaac";
        int charCount = myName.length();
        System.out.println("charCount = " + charCount);
        int lastCharIndex = charCount-1;
        System.out.println("lastCharIndex = " + lastCharIndex);

        System.out.println(myName.substring(0,1));

        for (int x = 0; x <=lastCharIndex ; x++) {
            System.out.print(myName.substring(x,(x+1))+"->");
        }

        // find out index of all the letter an in cases insensitive manner
        // I will go through each and every letter of the String --> for loop
             //  ---> each character I can use substring(0,1) and so on
             // --->  going from 0 to last indext    ---> for loop

        // while I am checking each character I will check wheter current character I am looking at
        // equals to a or A   --->>> currentCharacter.equalsIgnoreCase("a)
        // if it is, I will print the index -->> println (the variable you used to keep the index)
        // if not --> just move on.
        // perform this action until I reach last character.
            //   --->> if I go over last character index I stop

        for (int x = 0; x <= lastCharIndex; x++) {

        }
    }
}
