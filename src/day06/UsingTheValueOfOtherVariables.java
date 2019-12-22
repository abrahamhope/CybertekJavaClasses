package day06;

public class UsingTheValueOfOtherVariables {
    public static void main(String[] args) {
        int myFavoriteNumber=290;
        int yourFavoriteNumber= myFavoriteNumber;

        System.out.println("My favorite number "+myFavoriteNumber);
        System.out.println("Your favorite number "+yourFavoriteNumber);

        String yourOrder= "pizza";
        String myOrder=yourOrder;
        System.out.println("My Order "+ "\n"+myOrder+" Your Order "+"\n"+ yourOrder);

    }
}
