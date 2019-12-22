package day12;

public class FizzBuzzNumberCheck {
    public static void main(String[] args) {
        int myNumber = 3;
        if(myNumber % 5==0 && myNumber % 3 ==0 ){
            System.out.println("FizzBuzz Number");
        }else if (myNumber % 5==0){
            System.out.println("Fizz Number");
        }else if(myNumber % 3 ==0){
            System.out.println("Buzz Number");
        }
    }
}
