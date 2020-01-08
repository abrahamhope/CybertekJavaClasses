package replit;

public class UniqueChars179 {
    public static void main(String[] args) {
        //test your code
        System.out.println( uniqueChars("wooden-spoon") ) ;
    }

    public static String uniqueChars(String str) {
        //TODO: write your below
        String uniqueChars="";
        for (int i = 0; i < str.length(); i++) {
            if(!uniqueChars.contains(str.charAt(i)+"")){
                uniqueChars+=str.charAt(i)+"";
            }
        }
        return uniqueChars;
    }
}
