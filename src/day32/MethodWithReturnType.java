package day32;

public class MethodWithReturnType {
    public static void main(String[] args) {
       String name= giveMeMyName();
        System.out.println("name = " + name);

        int myResult = doubleTheNumber(10);
        System.out.println("myResult = " + myResult);

    }
    public static String giveMeMyName(){

        return "Isaac";
    }

    public static int doubleTheNumber(int num){
        System.out.println("I am going to double the value of "+num);
        int result = num*2;
        return result;

    }


}
