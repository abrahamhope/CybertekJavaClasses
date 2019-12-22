package day21;

public class LoopControlStatement {
    public static void main(String[] args) {
    //break
        // if line contains break reaches the loop will stop !!!.


        int sum=0;
        for (int x = 0; x < 10; x++) {
            System.out.println("current sum is "+sum);

            if(sum+x>40){
                break;
            }
            // we need to add the sum after we make sure it did not go over 40
            sum=sum+x;
        }
        System.out.println("sum = " + sum);


    }
}
