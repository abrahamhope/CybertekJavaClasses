package day45;

public class Fruit {
    // Always create an empty constructor in super class to
    // avoid any errors

    // ALWAYS ADD NO ARG CONSTRUCTOR IN SUPER CLASS
    // TO AVOID UNNECESSARY ERROR OF SUB CLASS CALLING
    // SUPER CLASS'S NO ARG CONSTRUCTOR
    public Fruit() {
        System.out.println("No Arg Fruit constructor");
    }

    public Fruit(String str) {
        System.out.println("One Arg Fruit constructor");
    }
}
