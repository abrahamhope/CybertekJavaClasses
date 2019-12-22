package day22;

public class ArrayIntro {
    public static void main(String[] args) {

        int num1=10;

        //syntax for creating variable to store multiple items
        //and assinginin a value
        //dataType[]variableName value here
        //this array can hold 4 ietms, it is also known

        int[] scores = new int[4];
        // assigning value to each index
        scores[0] = 95;
        scores[1] = 70;
        scores[2] = 88;
        scores[3] = 100;

        // accessing the elements inside array one by one
        System.out.println(scores[0]);
        System.out.println(scores[1]);
        System.out.println(scores[2]);
        System.out.println(scores[3]);

        //once array is created with certain size we CANNOT CHANGE THE SIZE!!!
        // when you create new array object
        // it will get default value in each element

        int[] numbers = new int[3];

        // create a byte array with size 4
        // and store it into a variable called data

        // assign a value for each index location

        byte [] data = new byte[4];

        data[0] = 4;
        data[1] = 5;
        data[2] = 12;
        data[3] = 43;

        System.out.println(data[0]);
        System.out.println(data[1]);
        System.out.println(data[2]);
        System.out.println(data[3]);



    }
}
