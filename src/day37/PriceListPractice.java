package day37;

import java.util.ArrayList;
import java.util.List;

public class PriceListPractice {
    public static void main(String[] args) {

        List<Double> priceList = new ArrayList<>();
        priceList.add(9.99);
        priceList.add(12.99);
        priceList.add(2.39);
        priceList.add(3.95);
        priceList.add(11.29);
        priceList.add(1.2);
        priceList.add(3.99);
        priceList.add(65.59);
        priceList.add(999.99);

        System.out.println("priceList = " + priceList);
        // change the third price to 10$
        priceList.set(2,10.0);

        // add 4 dollar to first price
        priceList.set(0, priceList.get(0)+4);

        // change last price to sum of the first and second price
        Double sumOfFirst2Items= priceList.get(0)+priceList.get(1);
        priceList.set(priceList.size()-1, sumOfFirst2Items);


        // give 40% off to second price
        priceList.set(1, priceList.get(1)*0.6);
        System.out.println("After 40% off of second price = "+ priceList.get(1));
        System.out.println("New Price List = "+priceList);

        // double the value of the each and every price int the list

        System.out.println("Doubled the prices with for loop");
        for (int i = 0; i < priceList.size(); i++) {
            priceList.set(i,priceList.get(i)*2);
        }
        System.out.println(priceList);
        System.out.println();
        //cut the price into half if the price is more than 20$
        for (int i = 0; i < priceList.size(); i++) {
            if(priceList.get(i)>=20){
                priceList.set(i,priceList.get(i)/2);
            }
        }
        System.out.println("Price List after cutting half = "+ priceList);

        //swap the first value with last value
        Double temp = priceList.get(0);
        priceList.set(0, priceList.get(priceList.size()-1));
        priceList.set(priceList.size()-1,temp);

        System.out.println("After swapping first and last value = "+priceList);
    }
}
