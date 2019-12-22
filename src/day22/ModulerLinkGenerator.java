package day22;

public class ModulerLinkGenerator {
    public static void main(String[] args) {
/*Here is the direct links to lead you to correct days
https://learn.cybertekschool.com/courses/278/modules#3317
this will lead you to day 21
https://learn.cybertekschool.com/courses/278/modules#3318
this will lead you to day 22
https://learn.cybertekschool.com/courses/278/modules#3319
this will lead you to day 23
https://learn.cybertekschool.com/courses/278/modules#3320
this will lead you to day 24
and so on
 */
        String baseURL="https://learn.cybertekschool.com/courses/278/modules#";
        String dayMsg="this will lead you to day ";

        System.out.println();


        for (int day = 1; day <=22; day++) {
            System.out.println(baseURL+(day+3296));
            System.out.println(dayMsg+day);

        }


    }
}
