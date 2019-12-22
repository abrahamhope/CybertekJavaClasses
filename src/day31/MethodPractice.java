package day31;

import java.util.Arrays;

public class MethodPractice {
    public static void count1to10(){
        for (int i = 0; i <=10; i++) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void countDownFrom20(){
        for (int i = 20; i >=0 ; i--) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void spellYourName(){
    String name="isaac";
        System.out.println(Arrays.toString(name.split("")));
    }
    public static void printOddNumbers1to100(){
        for (int i = 1; i <100 ; i+=2) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        count1to10();
        countDownFrom20();
        spellYourName();
        printOddNumbers1to100();
    }


}
