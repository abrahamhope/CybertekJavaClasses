package day08;

public class LogicalAndOperators {
    public static void main(String[] args) {
//        System.out.println(true&&true);
//        System.out.println(false&&false);
//        System.out.println(true&&false);
//        System.out.println(false&&false);
//
//        System.out.println(2<4&&4<6);
//        boolean b=10==10&&false;
//
//        System.out.println(b);

        String drink="tea";
        boolean hot=true;
        boolean free=true;

        boolean bool=drink.equals("coffee") && hot && free;
        System.out.println(bool);

        // & && difference. && is faster. Short circuit

        bool = drink.equals("coffee") & hot;
        bool = drink.equals("coffee") && hot;
        System.out.println(bool);


    }
}
