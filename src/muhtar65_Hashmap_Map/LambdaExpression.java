package muhtar65_Hashmap_Map;

import org.w3c.dom.ls.LSOutput;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class LambdaExpression {
    public static void main(String[] args) {
        Predicate<Integer> remove100 = p -> p==100;

        List<Integer> list1 = new ArrayList<>(Arrays.asList(100, 100, 100, 100, 100, 100));
       // list1.removeIf(remove100);
        System.out.println(list1);

        List<Integer> list2 = new ArrayList<>(Arrays.asList(100, 200, 300, 400, 500, 600));
        list2.removeIf(R -> R > 300);// remove anything that is more than 300
        System.out.println(list2);

        //forEach()
        List<Integer> list3 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 4, 6, 7, 8, 9,10));
        list3.forEach(p -> {if(p<5) {System.out.println(p);}});
        System.out.println("------------------------------------------------");

        list3.forEach(System.out::println);

        //remove all  that end with et from the list
        List<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Ahmed", "Karim","Yulduz", "Mahmat", "Sanat"));
        Predicate<String> removeET = p -> p.endsWith("et");
        names.removeIf(removeET);
        System.out.println(names);

        //task
        List<String> l1 = new ArrayList<>();
        l1.addAll(Arrays.asList("Muhtar", "Marufjon","Akerke","Asiya","Meryem"));
        List<String> l2 = new ArrayList<>();

        l1.forEach(A ->{if(A.startsWith("M")){l2.add(A);}});
        System.out.println("l2 after names with M have been added from l1 "+l2);

        l1.forEach(A ->{if(A.startsWith("M")){l2.add(A);}});



    }
}
