package day31;

import java.util.Scanner;

public class Greeting {

    public static void sayHelloTo(String name){
        System.out.println("Hello "+name);

    }

    public static void sayHello(){
        System.out.println("Hello B15");
    }
    public static void main(String[] args) {
        sayHello();
        sayHelloTo("Batch 15");
        sayHelloTo("Kids");

    }
}
