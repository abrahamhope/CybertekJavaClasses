package day17;


public class FizzBuzzTest {
    public static void main(String[] args) {

//        System.out.println("Enter a number to check fizz buzz");
//        int nmb = scan.nextInt();
//        if (num % 3 == 0 && num % 5 == 0) {
//            System.out.println(num + " is fizzbuzz number");
//        } else if (num % 3 == 0) {
//            System.out.println(num + " is fizz number");
//        } else if (num % 5 == 0) {
//            System.out.println(num + " is buzz number");
//        } else {
//            System.out.println("Weird number");
//        }

        int num=1;
        while (num<=100){
            if (num % 3 == 0 && num % 5 == 0) {
                System.out.println(num + " is fizzbuzz number");
            } else if (num % 3 == 0) {
                System.out.println(num + " is fizz number");
            } else if (num % 5 == 0) {
                System.out.println(num + " is buzz number");
            }
            ++num;
        }


    }

    }