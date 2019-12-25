package day33;

public class NumberAction {
    /**
     * getSumFrom1toX
     * this method should clculate the sum of the number user passed
     * @param x final number to be added
     * @return the sum of numbers from 1 to x
     */

    public static int getSumFrom1toX(int x){
         int sum = 0;

        for (int i = 0; i <x; i++) {
            sum+=i;
        }
        return sum;
    }

    public static String build_GOT_Email(String firstName, String lastname){
        String email=firstName.charAt(0)+lastname+"@NightWatch.com";
        return email;

    }

    public static void main(String[] args) {
        System.out.println("Sum of numbers from 1 to X is: "+getSumFrom1toX(15));
        System.out.println("Your email is: "+build_GOT_Email("isaac", "hope"));
    }
}
