package day64;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapEntrySetView_Practice {
    public static void main(String[] args) {
        Map<String,String> employeeMap = new HashMap<>();
        employeeMap.put("Ddene","Female");
        employeeMap.put("Winfred","Male");
        employeeMap.put("Jereme","Male");
        employeeMap.put("Glad","Female");
        employeeMap.put("Desirae","Female");
        employeeMap.put("Kakalina","Female");
        employeeMap.put("Bertrando","Male");
        employeeMap.put("Ajay","Female");
        employeeMap.put("Brigitte","Female");
        employeeMap.put("Derk","Male");
        employeeMap.put("Orlando","Male");
        employeeMap.put("Selle","Female");
        employeeMap.put("Marika","Female");
        employeeMap.put("Griffy","Male");
        employeeMap.put("Shanon","Female");
        employeeMap.put("Clerkclaude","Male");
        employeeMap.put("Rickard","Male");
        employeeMap.put("Job","Male");
        employeeMap.put("Aida","Female");
        employeeMap.put("Alonzo","Male");

        Set<Map.Entry<String, String>> employeePair = employeeMap.entrySet();
        for(Map.Entry<String, String> each:employeePair){
            if(each.getValue().equalsIgnoreCase("female")){
                System.out.println("each.getKey() = " + each.getKey());
            }
        }

        for(Map.Entry<String, String> each:employeeMap.entrySet()){
            if(each.getValue().equalsIgnoreCase("female")){
               each.setValue("Queen");
            }else{
                each.setValue("King");
            }
        }

        System.out.println("employeePair = " + employeePair);

        // interview question :
        //      Difference between HashMap , LinkedHashMap , TreeMap
        // HashMap default implementation : faster . no insertion order , no sorted order
        // LinkedHashMap extends HashMap  : slightly slower , keep insertion order , no sorted order
        // TreeMap:SortedMap implementation : slowest , no insertion order , keep sorted order

        //      Difference between HashMap and HashSet

        // HashSet is implementation of Set interface
        // store unique elements per item
        // HasMap is implementation of Map interface
        // it store key value pair -- keys are unique
        // TWO COMPLETELY DIFFERENT DATA STRUCTURE
    }
}
