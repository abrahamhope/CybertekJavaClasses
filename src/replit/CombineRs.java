package replit;

public class CombineRs {
    public static String combineRs(String[] r1,String[] r2)
    {
String combined="";
        for (int i = 0; i < r1.length; i++) {
            combined+=r1[i];
        }

        for (int i = 0; i < r2.length; i++) {
            combined+=r2[i];
        }
return combined;

    }
}
