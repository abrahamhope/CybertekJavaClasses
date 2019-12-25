package day33;

import org.w3c.dom.ls.LSOutput;

public class MethodPractice {
    public static String getSpelledName( String name){
        String result="";
        for (int i = 0; i < name.length()-1; i++) {
            result+=name.charAt(i)+"-";
        }
        result+=name.charAt(name.length()-1);
        return result;
    }

    public static void main(String[] args) {
String spelledName = getSpelledName("Serra");
        System.out.println("spelledName = " + spelledName);
        System.out.println(getSpelledName("Zeynep"));

/*
getSpelledName
This method will put dash in between given string
@param name this is the name parameter
@return the name has dash in between
for example: Alkbar -->> A-k-b-a-r
 */

    }
}
