package day62.Set;

import day61.TaskComparable.Job;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class JobTreeSet {
    public static void main(String[] args) {

        //Create a SortedSet of Job from(day 61) with TreeSet implementation

        SortedSet<Job> myJobs = new TreeSet<>();
        myJobs.add(new Job("MA",125000.00, "BCBS"));
        myJobs.add(new Job("NY", 150000.00, "Chase"));
        myJobs.add(new Job("MA", 135000.00, "Fidelity"));
        myJobs.add(new Job("MA", 115000.00, "FitBit"));
        myJobs.add(new Job("CT", 165000.00, "Yale"));

       // System.out.println(myJobs+"\n");//it knows to print in salary order because Job class has
                                        // comparable method that does it for us

        for (Job each: myJobs ) {
            System.out.println("each = "+each);

        }


        //How does HashSet decide 5 person object (name, age) are duplicate or not

    }
}
