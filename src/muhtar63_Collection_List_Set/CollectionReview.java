package muhtar63_Collection_List_Set;

import java.util.*;
import java.util.jar.JarOutputStream;

public class CollectionReview {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(100, 120, 100, 120, 130));
        System.out.println("ArrayList result = "+list);
        list.remove(new ArrayList<>(100));
        System.out.println("Arraylist");

        List<Integer> linkedList = new LinkedList<>();
        linkedList.addAll(Arrays.asList(100, 120, 100, 120, 130));
        System.out.println("LinkedList result = "+linkedList);

        Stack<Integer> stack = new Stack<Integer>();
        stack.add(100);
        stack.add(200);
        stack.add(300);
        stack.add(100);

        System.out.println(stack.pop());// pop() removes the last element
        System.out.println(stack);



        Set<Integer> setList = new HashSet<>();//HashSet doesn't accept duplicates and doesn't keep insertion order
        setList.add(100);
        setList.add(200);
        setList.add(300);
        setList.add(400);
        setList.add(500);

        System.out.println("HashSet result "+setList);

        Set<Integer> linkedHashSet = new LinkedHashSet<>();// keeps the order of insertion
        linkedHashSet.add(300);
        linkedHashSet.add(200);
        linkedHashSet.add(300);
        linkedHashSet.add(100);
        linkedHashSet.add(500);
        linkedHashSet.add(100);
        linkedHashSet.add(200);

        System.out.println("LinkedHashSet result = "+linkedHashSet);
        List<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(100, 120, 100, 120, 130));
        SortedSet<Integer> sortedSet = new TreeSet<>(list2);
        System.out.println(sortedSet);





    }
}
