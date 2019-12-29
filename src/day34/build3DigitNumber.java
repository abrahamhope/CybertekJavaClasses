package day34;

import org.w3c.dom.ls.LSOutput;

public class build3DigitNumber {
    /*
    1, write a method called build3DigitNumber
   it has 3 int parameters digit1 digit2 digit3
   and it will return the 3 digit numbers you have build
   if any of digit1 digit2 digit3 is not within the range of 0-9 the change it to 0 ,
   for example :
   build3DigitNumber(4,2,4) --->> 424
   build3DigitNumber(0,2,1) --->> 21
   build3DigitNumber(65,6,9) --->> 69
     */

    public static int build3DigitNumber(int digit1, int digit2, int digit3){
//        if((digit1>0&&digit1<10)&&(digit2>=0&&digit2<10)&&(digit3>=0&&digit3<10)){
//            int number=digit1*100+digit2*10+digit3;
//            return number;
//        }else {
//            return 0;
//        }
        if(digit1<0 ||digit1>9){
            digit1=0;
        }
        if(digit2<0 ||digit2>9){
            digit2=0;
        }
        if(digit3<0 ||digit3>9){
            digit3=0;
        }
        int number=digit1*100+digit2*10+digit3;
        return number;
    }
    public static void main(String[] args) {
        System.out.println(build3DigitNumber(8,9,2));
        System.out.println(build3DigitNumber(12,0,5));


    }


}
