package day21;

public class SearchAndFindWithLoop {
    public static void main(String[] args) {

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
        String myName="isaac An an";
        int charCount = myName.length();
        System.out.println("charCount = " + charCount);
        int lastCharIndex = charCount-1;
        System.out.println("lastCharIndex = " + lastCharIndex);

        System.out.println(myName.substring(0,1));

        for (int x = 0; x <=lastCharIndex ; x++) {
            System.out.print(myName.substring(x,(x+1))+"->");
        }

        System.out.println("-----1 char -----");

        for (int x = 0; x <= lastCharIndex; x++) {
            String currentChar = myName.substring(x, x+1);

            if(currentChar.equalsIgnoreCase("a")){
                System.out.println("The index of a or A is "+x);
            }

        }

        System.out.println("-----2 char -----");

        for (int x = 0; x <= lastCharIndex-1; x++) {
            String currentChar = myName.substring(x, x+2);

            if(currentChar.equalsIgnoreCase("an")){
                System.out.println("The index of an is "+x);
            }

        }

    }

}
