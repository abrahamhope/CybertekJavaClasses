package day55;

public class Calculator {
    private int result;


    public Calculator minusNum(int num) {

        this.result -= num;
        return this;

    }

    public void displayFinalResult() {

        System.out.println("final result = " + result);

    }


    // addNum is a method to add number to current result
    // and return same Calculator object
//    @@ -12,11 +27,12 @@
    // only one object . multiple method calls with chaining
    // this is called builder pattern in Java
//    public Calculator addNum(int num) {
//
//        // modify current object attribute
//        this.result += num;
//        // below code will create new object different than the current object
////        Calculator c = new Calculator();
////        return c;
//        //----------
//        // in order to just return current object after adding number
//        // we can use this -->> THE CURRENT OBJECT WE ARE WORKING ON !
//        // it will return the same object you used to call this method
//    }
}