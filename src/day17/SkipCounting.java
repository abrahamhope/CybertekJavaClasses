package day17;

public class SkipCounting {
    public static void main(String[] args) {
        // skip counting by 3 from 0 till 30

        int skipCount= 0;
        while (skipCount<30){
            skipCount +=3;

            System.out.print(skipCount+" ");
            //skipCount = skipCount+3;
        }
        System.out.println();
int evenNumbers= 0;
        while (evenNumbers<=50){
            System.out.print(evenNumbers+" ");
            evenNumbers +=2;
        }

        System.out.println(" ");

        int oddNumber=1;
        while (oddNumber<50){
            System.out.print(oddNumber+" ");
            oddNumber+=2;
        }


    }
}
