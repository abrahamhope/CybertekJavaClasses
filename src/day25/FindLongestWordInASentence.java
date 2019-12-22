package day25;

public class FindLongestWordInASentence {
    public static void main(String[] args) {
        String sentence= "We are trying to find longest word";
        String[] splitBySpace= sentence.split(" ");

        String longestWord="";
        int maxCharCount=0;

        for(String currentWord    : splitBySpace   ) {
        if(currentWord.length() > longestWord.length()){
            longestWord=currentWord;
        }
        }
        System.out.println("longestWord = " + longestWord);
    }
}
