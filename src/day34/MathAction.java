package day34;

import day31.CalculatorV2;

import java.util.Arrays;

public class MathAction {

    // calling the static method of other classes
    public static void main(String[] args) {
        //call your build3DigitNumber method here
        int result1 = build3DigitNumber.build3DigitNumber(6, 4, 0);
        System.out.println("result1 = " + result1);

        // in order to usea Arrays class that comes fom java.util package (not your package)
        // first we nee dot import then import java.util.Arrays;
        // in order to call static method fo Arrays class,
        // we need to use className.methodName(...)
        // here Arrays.toString(your array object goes here);

        int[]nums={2,5,87};
        System.out.println("Arrays.toString(nums) = " + Arrays.toString(nums));


        // how can i call static method CalculateV2
        // we need to import the class -->> import day31.CalculatorV2
       CalculatorV2.calculator('-',20,15);


    }
}
