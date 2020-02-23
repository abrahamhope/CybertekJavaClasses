package day61;

import java.util.LinkedList;

public class JobHunter {
    public static void main(String[] args) {

        Job j1 = new Job("GA",89000,"AB");
        Job j2 = new Job("VA",120000,"BC");
        System.out.println("j1.compareTo(j2) = " + j1.compareTo(j2));


//        LinkedList<Job> lst=new LinkedList<>();
//        Job j1 = new Job("Ga",89000,"AB");
//        Job j2 = new Job("Ga",120000,"BC");
//        Job j3 = new Job("Ga",90000,"DD");
//        Job j4 = new Job("Florida",200000,"ZZ");
//        Job j5 = new Job("Va",110000,"DG");

    }
}
