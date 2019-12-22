package day21;

public class BreakContinue {

    public static void main(String[] args) {

        for (int x = 0; x <=5; x++) {
            System.out.println(x);

//            if(x==5){
//                break;
//            }

            // this is pointless because after each iteration
            //it is going to the next iteration anyway
            continue;
        }
    }
}
