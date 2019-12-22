package day16;

public class SecondWordGetter2 {
    public static void main(String[] args) {
        // given a sentence with 3 words
        // get he second word

        //Step:
        // second word is between first space and last space

        //getting location of space rimind me of indexOf
        //getting string inside another string by beginning and ending index
        // remind me of substring

        String sentence= "you understand Java";
        String secondWord;

        int firstSpaceIndex = sentence.indexOf(" ");
        System.out.println("firstSpaceIndex = " + firstSpaceIndex);

        int lastSpaceIndex = sentence.lastIndexOf(" ");
        System.out.println("lastSpaceIndex = " + lastSpaceIndex);

        secondWord = sentence.substring(firstSpaceIndex+1, lastSpaceIndex);
        System.out.println("second word= " + secondWord);

        // how to get the first word
        // first word is starting from first character till first space

        String firstWord = sentence.substring(0, firstSpaceIndex);
        System.out.println("firstWord = " + firstWord);


    }
}
