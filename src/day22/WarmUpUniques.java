package day22;

public class WarmUpUniques {
    public static void main(String[] args) {
        /*
        Find Unique characters in a String :
aaaabbbbbcccaabbcd --->> abcd
One Logic :
create a String variable called uniques to store the unique characters , assign empty value
go through each and every character and check
whether the current character is already in uniques variable (uniques.contains(cuurentChar) )
if not concatenate it to unique variable
get out of the loop when you are done with last character
         */
        String str="aaaabbbbcccaabcd";
        String uniques="";

        //check each substring of the letter String
        //concatenate it to unique variable if unique variable doesn't have that character

        for (int i = 0; i <str.length() ; i++) {
            if (!uniques.contains(str.substring(i,i+1))){
                uniques+=str.substring(i,i+1);
            }
        }
        System.out.println("uniques = " + uniques);
    }
}
