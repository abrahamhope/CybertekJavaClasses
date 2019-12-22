package day21;

public class CoolLoopExample {
    public static void main(String[] args) {

        // count from 1 to 1
        // count from 1 to 2
        // count from 1 to 3
        // count from 1 to 4

        for (int x = 10; x >=1 ; x--) {

            for (int i = 1; i <= x; i++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
