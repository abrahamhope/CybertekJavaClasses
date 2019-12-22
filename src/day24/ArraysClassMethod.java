package day24;

import java.util.Arrays;

public class ArraysClassMethod {
    public static void main(String[] args) {

        // Array class a class coming from java.util package
        // it has a lot of pre-build method to work with array object

        // for printing the content of the array
        // toString  -->> Arrays.toString(yourArrayHere)
        // this method will give you string representation of anyt type of array
        // the result will look ---> [item1, item2, ... lastitem]


        String [] superHeroes ={"superman", "batman", "wonder woman", "aquaman", "flash", "cyborg"};
        System.out.println(Arrays.toString(superHeroes));

        String superHeroesAsString= Arrays.toString(superHeroes);
        System.out.println(superHeroesAsString);

        //how do we get first character of superHeroesAsString
        System.out.println(superHeroesAsString.charAt(0));

        int[] numbers= {2,56,12,35};
        System.out.println("As a string");
        System.out.println(Arrays.toString(numbers));

        // for sorting and array in ascending order
        // sort  ---> Arrays.sort(yourArrayHere)

        // for checking equality of two array object content
        // equals  ---> Arrays.equals(firstArray, secondArray)





    }
}
