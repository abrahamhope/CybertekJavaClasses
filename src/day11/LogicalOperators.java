package day11;

public class LogicalOperators {
    public static void main(String[] args) {
        int x=55;
        System.out.println("result of x==50 || x==51 || x==55");
        System.out.println( x==50 || x==51 || x==55);
        System.out.println( x>50 && x!=52 || x==57);

        System.out.println(7>5 && 1>7);
        System.out.println(5>5 && 9>7);
        System.out.println(1>5 && 9>7);

        System.out.println(7>5 & 1>7);
        System.out.println(5>5 & 9>7);
        System.out.println(1>5 & 9>7);
    }
}
