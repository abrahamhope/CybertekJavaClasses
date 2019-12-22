package day15;

public class SubString {
    public static void main(String[] args) {
        // getting the part of the String out of another String
        String movie= "Lord of the Rings";
// sub string will return part of another string starting from beginning
// index and right before the ending index (not including the ending index)
        // I want to get the String "of" from this movie
String wordOf = movie.substring(5,7);
        System.out.println("wordOf = " + wordOf);
String wordThe = movie.substring(8,11);
        System.out.println("wordThe = " + wordThe);

        int startingPoint= movie.indexOf(" ")+1;
        int endingPoint = movie.length();
        System.out.println(movie.substring(startingPoint,endingPoint));


        String secondWordTillLast = movie.substring(5,16);
        System.out.println("secondWordTillLast = " + secondWordTillLast);

        String wordLordOf = movie.substring(0,7);
        System.out.println("wordLordOf = " + wordLordOf);

        // if you provide only one parameter to substring method
        //it will start and continue till the end.
        //String movie= "Lord of the Rings";

        System.out.println(movie.substring(12,16)+" "+movie.substring(5,11)+" "+movie.substring(0,4));


    }
}
