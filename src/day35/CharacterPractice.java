package day35;

import javax.xml.stream.events.DTD;

public class CharacterPractice {
    public static void main(String[] args) {

        System.out.println("IS DIGIT METHOD PRACTICE");
        System.out.println(Character.isDigit(' '));
        System.out.println(Character.isDigit('6'));
        System.out.println(Character.isDigit('A'));

        String str = "A34B123C4X";
        //GET THE NUMBERS OUT OF THIS STRING AND STORE INTO AN INTEGER VARRIABLE X;
        String numsStr="";
        for (int i = 0; i < str.length(); i++) {
//            System.out.println("str.charAt(i) = " + str.charAt(i));
            if(Character.isDigit(str.charAt(i))){
                 numsStr+=str.charAt(i);
            }
        }
        System.out.println(numsStr);
        Integer num=Integer.valueOf(numsStr);
extractTheNumbersAndAdd("A34B123C4X");
addTheNumbersFromString("A34B123C4X");
    }
    public static void extractTheNumbersAndAdd(String str){
       int numTotal=0;
        for (int i = 0; i < str.length(); i++) {
            if(Character.isDigit(str.charAt(i))){
               int num = Integer.parseInt(str.charAt(i)+"");
                numTotal+=num;
            }
        }
        System.out.println("numTotal = " + numTotal);
    }

    public static void addTheNumbersFromString(String text){
        int sum=0;
        char [] allChars=text.toCharArray();
        for(char each : allChars){
            if(Character.isDigit(each)){
                int eachNumber=Integer.parseInt(each+"");
                sum+=eachNumber;
            }
        }
        System.out.println("sum = " + sum);

    }
}
