package day64;

import java.util.*;

public class RepresentingTableData {
    public static void main(String[] args) {
        // for single row
        // i want to get the value by its column name
        // so I choose Map

        Map<String ,String> row1= new LinkedHashMap<>();
        row1.put("First Name", "Regan");
        row1.put("email", "rboichat0@1688.com");
        row1.put("gender", "male");

        Map<String,String> row2 = new LinkedHashMap<>();
        row2.put("first_name", "Carleen" );
        row2.put("email", "cmorillas1@blog.com" );
        row2.put("gender", "Female" );

        // for one row I used one map
        // but I have many rows !
        // may of Some type -->> List<SomeType>

        System.out.println("row1 = " + row1);
        System.out.println("row2 = " + row2);

        List<Map<String ,String>> rowMaps = new ArrayList<>();
        rowMaps.add(row1);
        rowMaps.add(row2);

        System.out.println("rowMaps = " + rowMaps);

    }
}
