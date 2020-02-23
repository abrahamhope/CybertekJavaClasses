package day62;

import java.util.*;

public class SetInterface2 {

    public static void main(String[] args) {
        Set<String> states = new HashSet<>();
        states.addAll(Arrays.asList("GA","NY","FL","CA","NY","WA","VA","VA","FL"));
        System.out.println("states = " + states);

        for (String each : states){
            System.out.println("each = " + each);
        }

        // for loop does not work. No INDEX!!!

        states.forEach(each -> System.out.println("each = " + each));


    }

}
