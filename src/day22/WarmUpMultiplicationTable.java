package day22;

public class WarmUpMultiplicationTable {
    public static void main(String[] args) {
        //create a num int
        // increase the value of num by one up to 10
        // multiple num with an increasing value of i int in a loop
        // print the multiplication table

        int num = 0;
        for (int b = 0; b < 10; b++) {
            num++;
            for (int i = 1; i < 11; i++) {
                System.out.println(num + " * " + i + " = " + num * i);
            }
        }
    }
}
