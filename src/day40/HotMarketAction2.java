package day40;

public class HotMarketAction2 {
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

        String o1Str= o1.toString();
        System.out.println(o1.toString());

        //if you directly print out object, it will call toString() method automatically
        System.out.println(o1);  // this is what is automatically happening behind the scene


    }

}
