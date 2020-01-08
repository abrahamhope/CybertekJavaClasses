package replit;

public class CoverMe {
    public static void main(String[] args) {
        System.out.println(coverString("java methods", "me") ) ; //java [me]thods


    }

    public static String coverString(String main, String coverME) {
    // if the coverMe String is not in main string, add brackets to beginning and
        // end of the main String

        // if the main String contains coverMe, add brackets to the before and
        // after the coverMe String

        if(main.contains(coverME)){
            String newStr=main.replaceAll(coverME,("["+coverME+"]"));
            return newStr ;
        }else{
            String mainBrackets="["+main+"]";
            return mainBrackets;

        }

    }
}
