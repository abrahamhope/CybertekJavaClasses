package day08;

public class LogicalOrOperator {
    public static void main(String[] args) {
        String drink="tea";
        boolean hot=true;
        boolean free=true;

        boolean bool=drink.equals("coffee") && hot && free;
        System.out.println(bool);

        System.out.println(true||true);
        System.out.println(false||false);
        System.out.println(true||false);
        System.out.println(false||false);

        bool=4>10|| 4<5;
        System.out.println(bool);

        bool = drink.equals("water") ||drink.equals("tea");
        System.out.println(bool);

String model="bmw; ";
bool = model.equals("bmw") || model.equals("audi");
        System.out.println(bool);
    }
}
