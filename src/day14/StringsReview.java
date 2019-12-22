package day14;

public class StringsReview {
    public static void main(String[] args) {

        //method/action/behavior
        // Three questions to ask about method:
        // what does it do?
        // Do I need to provide extra data to take this action?
        // What do I get out of it?

        String str = "Pumpkin";
        System.out.println(str.equals("pumpkin"));

        /*
        String methods:
        equals
        equalsIgnoreCase
        toUpperCase
        toLowerCase
        length

        contain : checks wheter a string exists in another string
         */
        System.out.println("Does it contain Pumpkin?");
        System.out.println( str.contains("Pumpkin")   );
boolean gotPumpkin= str.contains("Pumpkin");
        System.out.println(gotPumpkin);
        
        boolean startedWithI = str.startsWith("I");
        System.out.println("startedWithI = " + startedWithI);

        boolean endWithPumpkin = str.endsWith("Pumpkin");
        System.out.println("endWithPumpkin = " + endWithPumpkin);


    }
}
