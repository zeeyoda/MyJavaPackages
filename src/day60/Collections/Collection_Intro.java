package day60.Collections;
import org.w3c.dom.ls.LSOutput;

import java.beans.beancontext.BeanContextChild;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collection;


public class Collection_Intro {
    public static void main(String[] args) {
        //List<String> names = new ArrayList<>();
        //and ArrayList implements List Interface
        //So we can safely say ArrayList IS-A Collection
        //List is the only data structure that has index(order), none of the other data structures has index
        Collection<String> names = new ArrayList<>();
        //with this assignment we can access on what Collection Interface have
        //so we can learn what any type of Collection including Set, Queue, List have in common
        names.add("Aziza");
        names.add("Iroda");
        names.add("Saida");
        names.add("Ibrohimjon");
        names.add("Lobar");

        names.addAll(names);// addAll method parameter type is collection(interface) so we can pass anything IS-A Collection
        names.size();
        //names.remove("Lobar");// removes the item in the first occurrence
        names.removeAll(Arrays.asList("Lobar"));
        Collection<String> toRemove = new ArrayList<>(Arrays.asList("Iroda"));
        names.remove(toRemove);

        for (String each: names) {
            System.out.println("eachName = "+each);
        }
//
        //for each logic in one shot
        //names.forEach( each -> System.out.println("each = "+each)); --> this is Lambda Expression






        //System.out.println("first item "+names.get(0));


    }
}
/**The word Collection everywhere:
 * Collection Framework - talking about entire topic/things
 * Collection Interface --> one interface under the entire Collection Framework
 * Collections class -->(it has s at the end), is a class just like Array and Arrays
 *                   --> is a utility class with many static methods
 *                   --> for example: Collection.sort(collection object)

 */
