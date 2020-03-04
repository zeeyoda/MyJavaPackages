package day62.Set;

import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class SetInList {
    public static void main(String[] args) {
        // Creating a HashSet with items already inside

        List<Integer> numList = Arrays.asList(10,10,20,20,20,30,30,30,30);
        System.out.println("numList = " + numList);

       Set<Integer> myNums = new HashSet<>(numList);
        System.out.println("myNums = " + myNums);
        List<Integer> collNum = new ArrayList<>(myNums);
        Collections.sort(collNum);
        System.out.println(collNum);

        Set<String> states = new HashSet<>();
        states.add("MA");
        states.add("OH");
        states.add("CA");
        states.add("TN");
        states.add("NJ");
        states.add("MA");
        states.add("OH");
        states.add("CA");
        states.add("TN");
        states.add("NJ");
        System.out.println("How many states ="+states.size());

//        for (String each : states){
//            System.out.println("each = "+each);
//        }

        //for loop does not work
        //Iterator can be used for ny type of collection at all time

        Iterator<String> stateIter = states.iterator();
        while(stateIter.hasNext()){
            System.out.println("s" +stateIter.next());
        }

        states.forEach(each -> System.out.println(each));

    }
}
