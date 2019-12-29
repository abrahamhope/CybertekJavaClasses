package replit;

public class WakeUp {
    public static void main(String[]args){
        System.out.println(shouldWakeUp(false,6));
    }
    public static boolean shouldWakeUp(boolean isBarking, int hourOfDay){
        if(hourOfDay<0||hourOfDay>23){
            return false;
        }else if(isBarking==true&&hourOfDay>22 || isBarking==true&&hourOfDay<8){
            return true;
        }else {
            return false;
        }
    }
}
