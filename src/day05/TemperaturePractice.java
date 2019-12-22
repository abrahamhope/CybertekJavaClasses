package day05;

import java.sql.SQLOutput;
import java.util.Scanner;

public class TemperaturePractice {
    public static void main(String[] args) {
        Scanner scan=new Scanner (System.in);
//        System.out.println("You can calculate how many seconds in an hour by entering the hour number");
//        System.out.print("Enter the hour here: ");
//        int hour= scan.nextInt();
//        int second= hour*60*60;
//        System.out.println("The number of seconds in "+ hour + " hours is = "+ second);
//
//        System.out.println("You can convert Fahrenheit to Celsius here");
//        System.out.print("Enter Fahrenheit value : ");
//        double temperatureF=scan.nextDouble();
//        double temperatureC=(temperatureF-32d)*(5.0d/9d);
//        System.out.println(temperatureF +"Fahrenheit is = "+temperatureC+ " Celsius");

//        System.out.println("Let's calculate your monthly income");
//        System.out.print("Please enter the hourly rate: ");
//        int hourlyRate= scan.nextInt();
//        System.out.println("Now enter the number of hours you've worked this week");
//        System.out.print("Number of hours worked: ");
//        int hoursWorked=scan.nextInt();
//        int income=hourlyRate*hoursWorked;
//        System.out.println("You've made $"+income+ " this week");

        System.out.print("price of tomato: $");
        int priceTomato=scan.nextInt();

        System.out.print("lb of tomato: ");
        double tomatoLb= scan.nextDouble();
        double priceTotal=priceTomato*tomatoLb;
        System.out.print("Amount you owe: $"+priceTotal);



    }
}
