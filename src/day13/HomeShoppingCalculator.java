package day13;

public class HomeShoppingCalculator {
    public static void main(String[] args) {
        boolean youWantToShop=true;
        String preference="other";
        if(youWantToShop) {
            if (preference.equals("Store")) {
                System.out.println("Going to store for shopping");
            } else {
                System.out.println("Going to online for shopping");
            }

        }else{
            System.out.println("Good job stay home coding!!!");

        }
    }
}
