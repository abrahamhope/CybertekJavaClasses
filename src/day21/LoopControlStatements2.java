package day21;

public class LoopControlStatements2 {
    public static void main(String[] args) {
        //continue
        //if line contain continue reachers, the loop will skip to next iteration
        // we can use break and continue for any type of loop

        for (int x = 0; x <=10 ; x++) {

            if(x%2==1){
                continue;
            }
// continue skips the codes that comes after

            System.out.println(x);


        }



    }
}
