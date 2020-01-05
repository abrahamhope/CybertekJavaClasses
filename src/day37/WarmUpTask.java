package day37;

import java.util.ArrayList;
import java.util.List;

public class WarmUpTask {
    public static void main(String[] args) {
/*
Warm up:
Create Arraylist of String and store
teamMates
print one by one
print reverse
print first last
print 2 at a time
concat everyone in one string separated by -
 */

        List<String> teamMates=new ArrayList<>();
        teamMates.add("isik");
        teamMates.add("akbar");
        teamMates.add("muhtar");
        teamMates.add("mike");
        teamMates.add("guljannat");
        teamMates.add("murat");
        teamMates.add("salih");
        teamMates.add("amir");

        System.out.println("teamMates = " + teamMates);

        System.out.println("First Item = " + teamMates.get(0));

        System.out.println("Last Item = " + teamMates.get(teamMates.size()-1));

        int lastIndex=teamMates.size()-1;

        for (int i = 0; i < teamMates.size(); i++) {
            System.out.println("\tteamMate "+(i+1)+" = " + teamMates.get(i));
        }
        System.out.println();
        for (int j =lastIndex; j>=0; j--) {
            System.out.println("\tTeammate "+(j+1)+" = "+teamMates.get(j));
        }

        System.out.println();
        for (int x = 0; x <= teamMates.size() - 2; x+=2) {
            System.out.println(teamMates.get(x)+"---"+teamMates.get(x+1));
        }

        String result="";
        for (int i = 0; i < teamMates.size(); i++) {
            if(i==teamMates.size()-1){
                result+=teamMates.get(i)+"";
            }else{
                result+=teamMates.get(i)+"-";
            }
        }
        System.out.println(result);

        System.out.println("teamMates String= " +
                teamMates.toString().replace(", ","-")
                                    .replace("[","")
                                    .replace("]","")
                                    .toUpperCase());

    }
}
