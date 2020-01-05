package day36;

public class OneNumber {


    public static void main(String[] args) {
        Boolean result1 = isOneNumber("h2i");
        System.out.println("result1= "+result1);
    }
    public static boolean isOneNumber(String str){
        for (int i = 0; i < str.length(); i++) {
            if(Character.isDigit(str.charAt(i))){
                return Boolean.valueOf(true);
            }
        }
        return Boolean.valueOf(false);
    }
}
