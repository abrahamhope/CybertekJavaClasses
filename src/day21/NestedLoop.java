package day21;

public class NestedLoop {
    public static void main(String[] args) {
        // count 1 to 5
        // repeat this 10 times

        for (int i = 0; i <10 ; i++) {


            for (int x = 1; x <= 5; x++) {
                System.out.print(x + " ");
            }
            System.out.println();
        }

    }
}
