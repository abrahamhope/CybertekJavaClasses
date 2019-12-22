package day21;

public class CountWithLoop {
    public static void main(String[] args) {
        // find out index of all the letter an in cases insensitive manner
        // I will go through each and every letter of the String  by 3 char--> for loop
        //  ---> each 3 character I can use substring(0,1) and so on
        // --->  going from 0 to 2 characters before last indext    ---> for loop

        // while I am checking every 3 character
        // I will check wheter current character I am looking at
        // equals to "lia"   --->>> currentCharacter.equalsIgnoreCase("lia")
        // if it is, I will add 1 to my counter
        // if not --> just move on.
        // perform this action until I reach two characters before last character.
        //   --->> if I go over last character index I stop
        String myName="Amelia Israfil Hajitev  mehmet Hajitev Amerlia Behlia ash";
        int charCount = myName.length();
        System.out.println("charCount = " + charCount);
        int lastCharIndex = charCount-1;
        System.out.println("lastCharIndex = " + lastCharIndex);

       int counter=0;
        System.out.println("----3chars-----");

        for (int x = 0; x <=lastCharIndex-2 ; x++) {
           String current2Chars =myName.substring(x,x+3);
           if(current2Chars.equalsIgnoreCase("lia")){
                counter++;
        }

        }
        System.out.println("counter = " + counter);

    }

}
