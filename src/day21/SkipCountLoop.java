package day21;

public class SkipCountLoop {
    public static void main(String[] args) {
        //skip all 5 divisible numbers
        //count 1 to 100
        for (int x = 0; x <=100; x++) {

            if(x%5==0){
                System.out.println("Skipping "+x);
                continue;
            }
            System.out.println(x);
        }
    }
}
