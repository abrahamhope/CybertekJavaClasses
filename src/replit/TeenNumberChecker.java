package replit;

public class TeenNumberChecker {
    public static void main(String[] args) {
        System.out.println(hasTeen(23,22,42));
    }
    public static boolean hasTeen(int a,int b, int c){
        if((a>12&&a<20) ||(b>12&&b<20)||(c>12&&c<20)){
            return true;
        }else{
            return false;
        }
    }
}
