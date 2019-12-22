package day07;

public class Casting {
    public static void main(String[] args) {
        //implicitly automatically
        //explicitly: programmer changes
//        int num = 10;
        double bigNum=10;
        System.out.println(bigNum); // 10 is implicitly (automatically) converted to double:10.0
        //and stored inside bigNum behind scene

        int num= (int) 12.99;
        //12.99 is double, double has much bigger range than int
        //so it just doesn't fit
        //int num = 12.99
        System.out.println(num);

        // create a long variable and store int
        long earthToMoon= 10000; //----->> 10000L
        // create an int variable and try to store above long value
        int earthtoMoonIn_int= (int) earthToMoon;

        System.out.println(earthtoMoonIn_int);

        char myFirstChar= 100;
        System.out.println(myFirstChar);

        char nOne=73;
        char nTwo= 83;
        char nThree= 73;
        char nFour= 75;
        System.out.println(nOne);
        System.out.println(nTwo);
        System.out.println(nThree);
        System.out.println(nFour);

        char letterA='a';
        System.out.println(letterA+1); // adding a character to an it number will result in int
        System.out.println(""+letterA+1);

    }
}
