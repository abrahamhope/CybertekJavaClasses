package replit;

import java.util.Scanner;

public class CatDog88 {
    public static void main(String[] args) {
/*
Print true if the string "cat" and "dog"
appear the same number of times in the given string word.

 */

        Scanner scan = new Scanner(System.in);
        int countOfCats = 0;
        int countOfDogs = 0;

        String word = scan.next();
        int iCat=word.indexOf("cat");
        while(iCat!=-1){
            countOfCats++;
            iCat = word.indexOf("cat", iCat+1);
        }

        int iDog=word.indexOf("dog");
        while(iDog!=-1){
            countOfDogs++;
            iDog = word.indexOf("dog", iDog+1);
        }
        System.out.println(countOfCats==countOfDogs);

    }
}
