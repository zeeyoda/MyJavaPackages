package muhtar65_Hashmap_Map;

import com.sun.source.tree.Tree;

import javax.swing.event.TreeSelectionEvent;
import java.util.*;

public class MapInterface {
    public static void main(String[] args) {

        Map<String, Double> employees = new HashMap<>();
        employees.put("Johnny", 45000.200);
        employees.put("Trish", 84700.00);
        employees.put("Alla", 125500.500);
        System.out.println(employees);

        double salary = employees.get("Trish");
        System.out.println(salary);

        System.out.println(employees.get("Ziyoda"));
        employees.remove("Alla");

        System.out.println("Removing Alla from the map "+employees);

        boolean s = employees.containsKey("Saida");
        System.out.println(s);

        boolean a = employees.containsValue(100000.00);
        System.out.println(a);

        Set<String> set = employees.keySet();
        System.out.println(set);

        Map<String, Integer> map1 = new LinkedHashMap<>();
        map1.put("A", 100);
        map1.put("A", 10);
        map1.put("A", 9);
        map1.put("A", 8);
        System.out.println(map1);
        map1.put("B",8);
        map1.put(null, null);
        System.out.println(map1);

        Hashtable<String, Integer> map2 = new Hashtable<>();
        map2.put("A", null);
        System.out.println(map2);

        TreeMap<String, Integer> map3 = new TreeMap<>();


    }
}
