package replit;

import java.sql.SQLOutput;
import java.util.Scanner;

public class TipCalculator90 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double totalTip=0;
        double checkAmount=0;
        double totalPay=0;
        int numberOfPeople=0;
        double totalPerPerson=0;
        double tipPerPerson=0;

        System.out.print("Split:");
        String split=scan.next();
        System.out.println();
        System.out.print("Number of people:");
         numberOfPeople=scan.nextInt();
        System.out.println();
        System.out.print("Check amount:");
         checkAmount=scan.nextDouble();
        System.out.println();
        System.out.print("Service Quality:");
        String serviceQuality=scan.next();
        System.out.println();

        String peopleEntered="";
        for (int i = 1; i <=numberOfPeople ; i++) {
            peopleEntered+="&";
        }

        System.out.println("Number of people entered: "+peopleEntered);


        if(serviceQuality.equalsIgnoreCase("poor")){
            totalTip=checkAmount*0.05;
        }else if(serviceQuality.equalsIgnoreCase("fair")){
            totalTip=checkAmount*0.1;
        }else if(serviceQuality.equalsIgnoreCase("good")){
            totalTip=checkAmount*0.15;
        }else if(serviceQuality.equalsIgnoreCase("great")){
            totalTip=checkAmount*0.2;
        }else if(serviceQuality.equalsIgnoreCase("excellent")){
            totalTip=checkAmount*0.25;
        }
        totalPay=checkAmount+totalTip;
        System.out.println("Total to pay: "+totalPay);
        System.out.println("Total tip: "+ totalTip);
        totalPerPerson=totalPay/numberOfPeople;
        System.out.println("Total per person: "+totalPerPerson);
        tipPerPerson=totalTip/numberOfPeople;
        System.out.println("Tip per person: "+tipPerPerson);



        // I want to calculate the tip based on the service quality
        // add the tip to check amount to find total pay
        // divide tip to number of people to find tipPerPerson
        // divide totalPay t number of people to find totalPerPerson

    }
}
