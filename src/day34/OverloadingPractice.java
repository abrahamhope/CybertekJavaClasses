package day34;

public class OverloadingPractice {

    public static void add(int num) {
        int result = num + 100;
        System.out.println(result);
    }

    public static void add(int num1, int num2) {
        int result1 = num1 + num2;
        System.out.println(result1);
    }

    public static void add(int numa, int numb, int numc) {
        int result2 = numa + numb + numc;
        System.out.println(result2);
    }

    public static void add(long num1, long num2) {
        long sum = num1 + num2;
        System.out.println();
    }

    public static void main(String[] args) {
        add(25);
        add(12, 15);
        add(3, 5, 7);
        add(25421, 45423);
    }
}
