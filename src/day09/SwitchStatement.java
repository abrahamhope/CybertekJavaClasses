package day09;

public class SwitchStatement {
    public static void main(String[] args) {
        int dayCode = 3;

        switch (dayCode) { //switch cannot check the range. it only checks values
            case 1:
                System.out.println("Day is Monday");
                break; // used to get out of this branch
            case 2:
                System.out.println("Day is Tuesday");
                break;
            case 3:
                System.out.println("Day is Wednesday");
                break;
            case 4:
                System.out.println("Day is Thursday");
                break;
            case 5:
                System.out.println("Day is Friday");
                break;
            case 6:
                System.out.println("Day is Saturday");
                break;
            case 7:
                System.out.println("Day is Sunday");
                break;
            default:
                System.out.println("Day is unknown");


        }
    }
}
