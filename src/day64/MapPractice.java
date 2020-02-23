package day64;

import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class MapPractice {
    public static void main(String[] args) {

        Map<String, List<String>> groupMap = new HashMap<>();

        groupMap.put("PowerOf4" , Arrays.asList("Furkan","Daria","Serife","Muge")  );
        groupMap.put("Achievers" , Arrays.asList("Maiia", "Anastasia", "Zaki", "Toyly", "Like")  );
        groupMap.put("BugHunter" , Arrays.asList("Ayse","Rabiyam","Gulzina")  );
        groupMap.put("BugBusters", Arrays.asList("Rukhshona","Fariza","Seyma","Sumeyyra","Huvayda"));

groupMap.forEach((groupCode, allMembers) -> System.out.println("groupCode = " + groupCode+" members = "+allMembers));
        System.out.println(groupMap.get("Achievers").get(3));
        groupMap.forEach((groupCode, allMembers) -> System.out.println("groupCode = " + groupCode + "\n\t members : " + allMembers));
        // get Toyly , he is at index 3
        System.out.println(groupMap.get("Achievers").get(3));
        // check whether this map has Gulzina or not in BugHunter ?
        // get method from Map | contains method is coming from list
        // because the values are List<String> get method will return the entire List
        System.out.println(groupMap.get("BugHunter").contains("Gulzina"));



    }


}
