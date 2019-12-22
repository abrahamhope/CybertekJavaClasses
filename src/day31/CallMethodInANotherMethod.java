package day31;

public class CallMethodInANotherMethod {
    public static void wakeUp(){
        System.out.println("Open your eyes");
        System.out.println("Close your eyes");
        System.out.println("Woke up!");
        System.out.println("-------------------------------");
    }

    public static void drinkCoffee(){
        System.out.println("Put coffee in your coffee machine");
        System.out.println("Pres the button to make coffee");
        System.out.println("-------------------------------");
    }

    public static void finallyAwake(){
        wakeUp();
        drinkCoffee();
    }
    public static void main(String[] args) {

        finallyAwake();


    }
}
