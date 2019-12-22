package replit;

import java.util.Scanner;

public class BookSale {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String start = scan.next();
        String end = scan.next();
        //pseudocode:
        //directions go in this repeating pattern: A right B down C left D up A right B down C left D
        //make this path a String
        //then find index of characters entered by user
        //and take out the portion of string with substring between those indexes

        if (start.equalsIgnoreCase(end)) { //checks only for start==end situations
            System.out.println(end + " found");
        } else {              //checks for all other combinations
            String directions = "A right B down C left D up A right B down C";
            int indexStart = directions.indexOf(start);
            int indexEnd;
            //we need to check if "end" comes after or before "start" in a our string above
            //to decide whether to use indexOf or lastIndexOf method
            if (start.charAt(0) < end.charAt(0)) {
                indexEnd = directions.indexOf(end);
            } else {
                indexEnd = directions.lastIndexOf(end); //will check backwards
            }

            String route = directions.substring(indexStart + 2, indexEnd - 1);
            route = route.replace('A', '>'); //will ignore if A is not present
            route = route.replace('B', '>');
            route = route.replace('C', '>');
            route = route.replace('D', '>');

            System.out.println(route + ": " + end + " found");
        }
    }
}