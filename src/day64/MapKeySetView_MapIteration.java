package day64;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapKeySetView_MapIteration {
    public static void main(String[] args) {
        Map<String, Double> groceryPriceMap = new HashMap<>();
        groceryPriceMap.put("Tomato", 1.99);
        groceryPriceMap.put("Patato", 2.99);
        groceryPriceMap.put("Grape", 3.99);
        groceryPriceMap.put("Banana", 0.99);
        groceryPriceMap.put("Apple", 1.89);

        // Map is not iterable so we can not directly iterate over them
        // we can get something iterable our of the map
        // for example keySet view will rerutn a Set<String> and it's iterable

        Set<String> allNames = groceryPriceMap.keySet();

        for(String eachName : allNames){
            System.out.println("eachName = " + eachName);
            System.out.println("groceryPriceMap.get(eachName) = " + groceryPriceMap.get(eachName));
        }


    }
}
