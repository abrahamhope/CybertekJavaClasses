package day35;

public class CalculatePrice {


    public static void main(String[] args) {

        String sentence="I bought 3 tomato and the prince was 3.14 each";
        String [] sentenceSplit=sentence.split(" ");
        int count= Integer.parseInt(sentenceSplit[2]);
        double price= Double.parseDouble(sentenceSplit[sentenceSplit.length-2]);
        double totalPrice=count*price;
        System.out.println(totalPrice);

    }
}
