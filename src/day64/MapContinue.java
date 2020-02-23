package day64;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapContinue {
    public static void main(String[] args) {

        Map<String, Double> groceryPriceMap = new HashMap<>();
        groceryPriceMap.put("Tomato", 1.99);
        groceryPriceMap.put("Patato", 2.99);
        groceryPriceMap.put("Grape", 3.99);
        groceryPriceMap.put("Banana", 0.99);
        groceryPriceMap.put("Apple", 1.89);

        // Map view :
            // keySet view, values view, entrySet view
        // How do I store all the keys into a Collection?
            // What do you think the data type will be to store such collection?
            // ---Set , because keys are unique

        // we can use keySet() method of Map to get Set of Keys
        // this Set is strictly connected to the original map
        // if you remove an item, map entry with this wil be also removed.
        Set <String> allNames = groceryPriceMap.keySet();
//      System.out.println("groceryPriceMap = " + groceryPriceMap);

        // WHAT IF WE DO NOT WANT SUCH RELATIONSHIP AND WE JUST WANT TO USE THE KEYS SOMEWHERE ELSE?
            // GET A COPY OF THE SET into different objects
        Set<String> namesCopy = new HashSet<>(allNames);
        System.out.println("namesCopy = " + namesCopy);
namesCopy.remove("Tpmato");
        System.out.println("groceryPriceMap = " + groceryPriceMap);


    }
}
