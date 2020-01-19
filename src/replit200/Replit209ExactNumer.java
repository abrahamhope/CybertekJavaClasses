package replit200;

public class Replit209ExactNumer {
    public static String extractNum(String s) {

        String exactNum="";
        for (int i = 0; i < s.length(); i++) {
           if( Character.isDigit(s.charAt(i))){
               exactNum+=s.charAt(i);
           }
        }
        return exactNum;
    }
}
