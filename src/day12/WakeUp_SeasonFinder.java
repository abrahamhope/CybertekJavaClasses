package day12;

public class WakeUp_SeasonFinder {
    public static void main(String[] args) {

        int month=12;
        if(month<1 || month>12){
            System.out.println("Invalid Month");
        }else if(month>=3 && month<=5){
            System.out.println("It is Spring");
        }else if(month>=6 && month<=8){
            System.out.println("It is Summer");
        }else if(month>=9 && month<=11){
            System.out.println("It is Fall");
        }else if(month==1 || month==2 || month==12){
            System.out.println("It is Winter");
        }
    }
}
