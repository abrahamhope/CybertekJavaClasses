package day23;

public class ForEachLoopPractice {
    public static void main(String[] args) {
/*
create a long array or 5 times called salaries
put your salary amounts that ok for your offer
user for each loop to iterate over them
and print them out

OPTIONALLY:
print only the salary more than 100,000
 */
        long[] salaries= {120000, 85000, 95000, 145000};

        for(long eachSalary : salaries){
            System.out.println(eachSalary);
        }

        long max=salaries[0];
        for (int i = 0; i <salaries.length ; i++) {
            if(salaries[i]>max);
            max=salaries[i];
        }
        System.out.println("max = " + max);


    }
}
