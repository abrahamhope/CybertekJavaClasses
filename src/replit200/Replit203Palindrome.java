package replit200;

public class Replit203Palindrome {
    public static void main(String[] args) {
        isPalindrome("nurses run");
    }

    public static boolean isPalindrome(String check) {

        check=check.replace(" ","");
        String reversed="";
        for(int i=check.length()-1;i>=0;i--){
            reversed+=check.charAt(i);
        }

        return reversed.equalsIgnoreCase(check);
    }
}
