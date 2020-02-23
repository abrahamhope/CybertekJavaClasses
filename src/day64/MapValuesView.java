package day64;

import java.util.*;

public class MapValuesView {
    public static void main(String[] args) {
        Map<String, Double> groceryPriceMap = new HashMap<>();
        groceryPriceMap.put("Tomato", 1.99);
        groceryPriceMap.put("Patato", 2.99);
        groceryPriceMap.put("Grape", 3.99);
        groceryPriceMap.put("Banana", 1.99);
        groceryPriceMap.put("Apple", 1.89);

        System.out.println("groceryPriceMap = " + groceryPriceMap);
        // in order to get all the values in the map and store it to colleciton
        // we can use values method from the map and it will return
        // a Collection object that contains all the value

        Collection<Double> allPrices = groceryPriceMap.values();
        System.out.println("allPrices = " + allPrices);
        // first come first serve -- first occurrence will be removed
        allPrices.remove(1.99);
        System.out.println("groceryPriceMap = " + groceryPriceMap);

        List<Double> pricesCopy = new ArrayList<>(groceryPriceMap.values());



    }
}
