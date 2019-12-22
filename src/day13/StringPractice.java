package day13;

public class StringPractice {
    public static void main(String[] args) {
        String s1="hello";
        //toUpperCase method of String is used to make String all character uppercase.
//        System.out.println(s1);
//        System.out.println(s1.toUpperCase());
//
//        String myName="isaac";
//        System.out.println("My name in uppercase is: "+myName.toUpperCase());
//        System.out.println("My name in lowercase is: "+myName.toLowerCase());
// in order to get how many character we haev inside String
        // we canuse length method of String
        System.out.println(s1.length());
int lengthOfStr=s1.length();
        System.out.println(lengthOfStr);
        if(lengthOfStr>3){
            System.out.println("More than 4 character");
        }else {
            System.out.println("Not more than 4");
        }


    }
}
