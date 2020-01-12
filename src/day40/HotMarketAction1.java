package day40;

import java.util.ArrayList;

public class HotMarketAction1 {
    public static void main(String[] args) {
        Offer o1= new Offer();
        o1.company="apple";
        o1.location="Austin";
        o1.isFullTime=true;
        o1.salary=140000;
        o1.displayInformation();

        o1.displayInformation();
        o1.turnToFullTime();
        o1.changeLocation("DC");
        o1.displayInformation();


        o1. changeAllInfo("amazon","virginia", 150000, true);

        boolean result = o1.is100KOffer();
        if(result==true){
            o1.changeLocation("atlanta");
        }
        o1.displayInformation();

    }

}
