package day43;

public class Starbucks {
    public static void main(String[] args) {
        Coffee c1=new Coffee();
        System.out.println("c1 = " + c1);

        Coffee c2= new Coffee("Intensito", 9);
        System.out.println("c2 = " + c2);

        Coffee c3= new Coffee("latte", 3, 2.5);
        System.out.println("c3 = " + c3);

        Coffee c4=new Coffee("Blonde", 5, -2.6);
        System.out.println("c4 = " + c4);

        double sumOfAllCoffee= c1.getPrice()+c2.getPrice()+c3.getPrice()+c4.getPrice();
        System.out.println("sumOfAllCoffee = " + sumOfAllCoffee);




    }
}
