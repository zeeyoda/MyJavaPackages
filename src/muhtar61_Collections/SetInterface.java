package muhtar61_Collections;

import com.sun.source.tree.Tree;
import office_02_10.Task3.Testers;

import java.lang.reflect.Array;
import java.util.*;

public class SetInterface {
    public static void main(String[] args) {
        Set<Integer> st1 = new HashSet<>();// set does not have index numbers
        st1.add(100);
        st1.add(100);
        st1.add(100);
        System.out.println(st1);// it will only prints one 100 as Set only accepts unique values

        System.out.println("============================================");
        System.out.println("Hashset example below");
        Set<Integer> hashset = new HashSet<>();
        hashset.add(100);
        hashset.add(10);
        hashset.add(5);
        hashset.add(4);
        hashset.add(100);
        hashset.add(1);
        hashset.add(3);
        System.out.println(hashset);// HashSet doesn't keep the order as it is

        System.out.println("LinkedHashset example below");
        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(100);
        linkedHashSet.add(10);
        linkedHashSet.add(5);
        linkedHashSet.add(4);
        System.out.println(linkedHashSet);// LinkedHashSet keeps the order as it is

        System.out.println("SortedSet interface and TreeSet example");
        SortedSet<String> treeSet = new TreeSet<>();// TreeSet sorts the objects
        treeSet.add("Z");
        treeSet.add("Y");
        treeSet.add("X");
        treeSet.add("W");
        System.out.println(treeSet);

        //Task: remove duplicates and sort the ArrayList.
        List<Integer> list = new ArrayList<>();
                       list.addAll(Arrays.asList(10, 9, 7, 8, 6));
                       Collections.sort(list);
                       System.out.println(list);

        List<Integer> letsSort = new ArrayList<>();
                        letsSort.addAll(Arrays.asList(29,29,28,27, 27,26));

         TreeSet<Integer> sortWithTreeSet = new TreeSet<>(letsSort);
        System.out.println("Sorting ArrayList and removing duplicates using TreeSet "+sortWithTreeSet);

        //Task: remove duplicates from String and print in ascending order
        String str = "ZZZZYYYXXXAAAABBBCCCCDDDD";
        String[] arr = str.split("");
        System.out.println(Arrays.toString(arr));
        LinkedHashSet<String> str2 = new LinkedHashSet<>(Arrays.asList(arr));// removes the duplicate
        System.out.println(str2);

        //second short solution
        String shortWay = new LinkedHashSet<String>(Arrays.asList(arr)).toString();
        System.out.println("This is the shortway "+shortWay);

        TreeSet<String> str3 = new TreeSet<>(str2);//places in ascending order
        String result = str3.toString().replace("[", "").replace("]", "").replace(", ", "");

        System.out.println(result);


        String mixed = "sklgsldghsssdkgskg";
        String[] splitMixed = mixed.split("");
        TreeSet<String> mixedWithoutDup = new TreeSet<>(Arrays.asList(splitMixed));
        //this is the shorter way to cut lines of code
        String result1 = new TreeSet<>(Arrays.asList(splitMixed)).toString();//this provides String representation of an Array
        String result2 = mixedWithoutDup.toString().replace("[","").replace("]","").replace(", ","");
        System.out.println(mixedWithoutDup);
        System.out.println(result2);





    }
}
