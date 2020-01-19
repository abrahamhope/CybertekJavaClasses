package day43;

import day42.Movie;

import java.lang.management.MonitorInfo;

public class MovieActions {

    public static void main(String[] args) {
        Movie m1 = new Movie("Joker", 2.5, "Drama");
        printMovieInformation(m1);

        Movie m2= new Movie("Cinderella", 1.5, "Family");
        printMovieInformation(m2);
        printShorterMovieName(m1,m2);
    }
    public static void printMovieInformation(Movie movieObj){
        System.out.println("The movie "+movieObj.getName()+
                " is "+movieObj.getLength()+" hour long and it's genre is "+
                movieObj.getType());
    }
    public static void printShorterMovieName(Movie movieObj1, Movie movieObj2) {
        //TODO YOUR CODE HERE
        if(movieObj1.getLength()>movieObj2.getLength()){
            System.out.println("Shorter length movie between these two is : "+movieObj2.getName());
        }else{
            System.out.println("Shorter length movie between these two is : "+movieObj1.getName());
        }
    }

}
