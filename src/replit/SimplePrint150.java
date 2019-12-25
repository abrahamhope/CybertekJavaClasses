package replit;

public class SimplePrint150 {
    public static void main(String[] args) {

        printHollowRect();
    }

    public static void printHollowRect() {
        for (int i = 0; i < 5; i++) {
            if (i > 0 && i < 4) {
                for (int j = 0; j < 5; j++) {
                    if(j==0||j==4){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }

            } else if(i==0|| i==4){
                for (int j = 0; j < 5; j++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
