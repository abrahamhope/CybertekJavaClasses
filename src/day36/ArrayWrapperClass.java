package day36;

public class ArrayWrapperClass {
    public static void main(String[] args) {
        sumAndPrint(12,13);
        sumAndPrint(Integer.valueOf(23),Integer.valueOf(10));
        // non deprecated way of adding objects.

        System.out.println("------------ method with int parameter");
        printTheDoubledValue(10);
        printTheDoubledValue(new Integer(10));
    }

    public static void sumAndPrint(Integer num1, Integer num2){
        // we cannot add two objects.
        // what is happening here is
        // the moment the "+" operator appeared,
        // compiler will turn num1 and num2 into "int" so it can add them numerically
        // Integer to int conversion --> auto-unboxing

        System.out.println( num1 + num2 );

    }

    /**
     * @return
     * @param x
     * This method will print the doubled value of what user passed
     */
    public static void printTheDoubledValue(int x){
        System.out.println("after doubling x = "+(x*2));
    }
}
