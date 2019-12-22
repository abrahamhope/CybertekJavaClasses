package day11;

public class StringClass {
    public static void main(String[] args) {
        String name = "Rabia"; //String literal ""
        String name2 = new String("Rabia");

        String name3= "Rabia";

        System.out.println(name);
        System.out.println(name2);
        System.out.println(name3);

        System.out.println(name == name2);
        System.out.println(name == name3);

        // the correct way of comparing String to get consistent result is
        // using one of the String object behavior / method called
        // equal method
        // str1.equals(str2)

        System.out.println(name.equals(name2));
        System.out.println(name.equals(name3));

    }
}
