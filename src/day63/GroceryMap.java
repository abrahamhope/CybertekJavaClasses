package day63;

import replit.Has55136;

import java.util.HashMap;
import java.util.Map;

public class GroceryMap {
    public static void main(String[] args) {

        Map<String, Double> groceryPriceMap= new HashMap<>();
        groceryPriceMap.put("cheese",8.99);
        groceryPriceMap.put("egg",2.99);
        groceryPriceMap.put("milk",5.99);
        groceryPriceMap.put("poultry",2.99);
        groceryPriceMap.put("beef",3.99);
        groceryPriceMap.put("bread",1.99);
        groceryPriceMap.put("onion",0.99);
        groceryPriceMap.putIfAbsent("poultry",2.99);

        System.out.println("groceryPriceMap = " + groceryPriceMap);

        groceryPriceMap.get("milk");
        groceryPriceMap.replace("poultry", 2.99, 6.99);
        groceryPriceMap.replace("cheese", 8.99,17.99);

        groceryPriceMap.remove("egg");

        System.out.println("groceryPriceMap = " + groceryPriceMap);




    }
}
