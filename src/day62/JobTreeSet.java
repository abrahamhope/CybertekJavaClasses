package day62;

import day61.Job;

import java.util.*;

    public class JobTreeSet {
    public static void main(String[] args) {
        //create a sorted set of job from day 61
        //with this tree set implementation
        //add 5 jobs and print them out vertically and see what you get
        TreeSet<Job> myJobs = new TreeSet<>();
        myJobs.add(new Job("MA", 150000, "Hubspot"));
        myJobs.add(new Job("ME", 165000, "StitchFix"));
        myJobs.add(new Job("NH", 150000, "Care.com"));
        myJobs.add(new Job("NJ", 170000, "Google"));
        myJobs.add(new Job("MA", 120000, "Amazon"));
        myJobs.add(new Job("NH", 100000, "CarGurus"));

        for (Job each: myJobs) {
            System.out.println("each = " + each);
        }
    }


}
