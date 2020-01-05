package day36;

import java.util.ArrayList;

public class ArrayListMethod {
    public static void main(String[] args) {

        ArrayList<Long> lst = new ArrayList<>();

        // add item, insert and item, read item, update item, remove item, check the location
        // CRUD
        //Create, read, update, delete

        lst.add( 12L ) ; // 12L is automatically converted to new Long(12L) object.
        lst.add( 100L ) ;
        lst.add( 200L ) ;

        System.out.println("lst = " + lst);

        System.out.println("lst.size() = " + lst.size());

        System.out.println("First Item is = " + lst.get(0));





    }


}
