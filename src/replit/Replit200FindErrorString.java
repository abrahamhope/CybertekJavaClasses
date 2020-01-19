package replit;


public class Replit200FindErrorString {
    public static boolean isError(String line) {
    String[] str=line.split(" ");
    if(!str[0].equals("error")){
        return false;
    }
    return true;
    }
}
