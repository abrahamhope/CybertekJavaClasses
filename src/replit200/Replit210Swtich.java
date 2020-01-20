package replit200;

public class Replit210Swtich {
    public static void main(String[] args) {

        String word="..zxcv..d";

//        String word="---abmkl.o-";
//        String word = "---abmkl.o-";
        reverseLetters(word);
    }
    public static String reverseLetters(String word) {
        String output = "";
        for (int i=0, k=word.length()-1; i<word.length(); i++) {
            if (Character.isLetter(word.charAt(i))) {
                while (!Character.isLetter(word.charAt(k))) {
                    k--;
                }
                output += word.charAt(k);
                k--;
            } else {
                output += word.charAt(i);
            }
        }
        return output;
//        String letters="";
//        String reversed="";
//        String result="";
//        for (int i = 0; i < word.length(); i++) {
//            if(Character.isLetter(word.charAt(i))){
//                letters+=word.charAt(i);
//            }
//        }
//
//        for (int i = letters.length()-1; i >=0 ; i--) {
//            reversed+=letters.charAt(i);
//        }
//
//        for (int i = 0, x=0; i < word.length(); i++) {
//            if(!Character.isLetter(word.charAt(i))){
//                result+=word.charAt(i);
//            }else{
//                result+=reversed.charAt(x);
//                x++;
//            }
//        }
//        return result;

    }

}
