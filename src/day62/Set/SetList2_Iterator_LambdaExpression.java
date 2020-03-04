package day62.Set;

import java.beans.beancontext.BeanContextChild;
import java.util.*;

public class SetList2_Iterator_LambdaExpression {
    public static void main(String[] args) {

        Set<String> states = new HashSet<>();
        // all Collection type has addAll method
        states.addAll(Arrays.asList("GA", "NY", "FL", "CA", "NY", "WA", "VA", "VA", "FL"));
        System.out.println("states before = " + states);
//        states.remove("GA");
//        System.out.println("states after  = " + states);
        states.removeIf( each -> each.contains("A"));//this is lambda expression, one way/short way to remove and print
        System.out.println("States after = "+states);
//
        //remove all the states with letter A

        Iterator<String> iterStates = states.iterator();
        //Iterator has 3 methods hasNext(); next(); remove(); works together
        //to remove item while iterating over a collection
        while(iterStates.hasNext()){
//            String each = iterStates.next();
//            if (each.contains("A")){
//                System.out.println("removing = "+each);
//                iterStates.remove();
//            System.out.println("After removing states with A = "+states);
                //do not call next method in one iteration otherwise it will skip to the next item
                if(iterStates.next().contains("A")){
                   // System.out.println("removing = "+iterStates.next());
                    iterStates.remove();
                }
            }
           // System.out.println("iterStates = "+iterStates.next());

        System.out.println("After removing states with A = "+states);

    }
}
