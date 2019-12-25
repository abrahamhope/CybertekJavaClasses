package day33;

public class MethodWithReturnPractice {

    public static String convertNumberToDay(int dayCode){
        String day="";
        switch (dayCode){
            case 1:
                day="Monday";
                break;
            case 2:
                 day="Tuesday";
                break;
            case 3:
                day="Wednesday";
                break;
            case 4:
               day="Thursday";
                break;
            case 5:
                day="Friday";
                break;
            case 6:
               day="Saturday";
                break;
            case 7:
                day="Sunday";
                break;
            default:
                day="Funday";

        }
        return day;
    }

    public static void main(String[] args) {
        System.out.println(convertNumberToDay(5));

        int[] allCodes={5,3,11,4,33};
for(int eachCode:allCodes){
    System.out.println("each day= "+convertNumberToDay(eachCode));
}


    }
}
