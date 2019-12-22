package day21;

public class OddNumberPrintRepetition {
    public static void main(String[] args) {

        for (int i = 1; i <5; i++) {

            for (int x = 0; x <10; x++) {
                if(x%2==0){
                    continue;
                }
                System.out.print(x);
            }
            System.out.println();
        }
    }
}
