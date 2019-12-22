package day23;

public class WarmUp {
    public static void main(String[] args) {
        /*
        Create an int array of 6 elements and find out
average of the array
sum of all elements
sum of even numbers in the array
sum of odd numbers in the array
max number in the array
min number in the array
         */
        int[] numbers = {9, 25, 65, 56, 89, 78};
        int sum=0;
        int sumEven=0;
        int sumOdd=0;

        for (int i = 0; i <6; i++) {
            sum+=numbers[i];
        }
        System.out.println("sum = " + sum);

        for (int i = 0; i <6; i++) {
           if(numbers[i]%2==0){
               sumEven+=numbers[i];
           }
        }
        System.out.println("sumEven = " + sumEven);

        for (int i = 0; i <6; i++) {
            if(numbers[i]%2!=0){
                sumOdd+=numbers[i];
            }
        }
        System.out.println("sumOdd = " + sumOdd);


    }
}
