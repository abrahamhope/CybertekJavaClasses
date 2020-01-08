package replit;

public class MergeStrings178 {
    public static void main(String[] args) {
        System.out.println(mergeStrings("wooden","spoon"));
    }
    public static String mergeStrings(String one, String two) {
        int index=(one.length()>two.length() ? one.length() : two.length());
        String mergedString="";
        for (int i = 0; i < index; i++) {
            if(i<one.length()){
                mergedString+=one.charAt(i);
            }
            if(i<two.length()){
                mergedString+=two.charAt(i);
            }

        }
        return mergedString;

    }
}
