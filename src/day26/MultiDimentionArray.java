package day26;

public class MultiDimentionArray {
    public static void main(String[] args) {
        int[] scores= {156,101,176, 87, 76,10};
        int count=0;
        for (int eachNum:scores ) {
            if(eachNum>100){
                System.out.println("eachNum = " + eachNum);
                count++;
            }
        }
        System.out.println("count = " + count);
    }

}
