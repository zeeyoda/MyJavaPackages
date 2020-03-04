package day61.TaskComparable;

import java.util.*;

public class LinkedList_Iteration {
    public static void main(String[] args) {
        Job j1 = new Job("Florida", 121000.00, "Disney");
        Job j2 = new Job("California",150000.00, "Yahoo");
        Job j3 = new Job("Washington DC", 120000.00, "White House");

        Collection<Job> myjobs = new ArrayList<>(Arrays.asList(j1, j2, j3));
        Iterator<Job> jobIter = myjobs.iterator();

//        while(jobIter.hasNext()){
//            if(jobIter.next().getSalary()>125000.00){
//                jobIter.remove();
//            }
//        }
       // System.out.println(myjobs);

        while(jobIter.hasNext()){
            if(!jobIter.next().getLocation().equals("Florida")){
                jobIter.remove();

            }
        }
        System.out.println(myjobs);


    }
}
