package muhtar61_Collections;


import java.lang.reflect.Array;
import java.util.*;

public class ListInterface {
    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();
        List<String> list2 = new LinkedList<>();
        List<Double> list3 = new Vector<>();

        ArrayList<Integer> arrayList = new ArrayList<>();
                arrayList.add(10);
                arrayList.add(20);
                arrayList.add(30);
                arrayList.remove(1);
        System.out.println(arrayList);

        LinkedList<Integer> linkedList = new LinkedList<>();
                linkedList.add(40);
                linkedList.add(50);
                linkedList.add(60);
                linkedList.remove(1);

        System.out.println(linkedList);
        System.out.println("-----------------------------------------");

        String[] arr = {"A", "B", "B"};
        List<String> NotLinked = new ArrayList<>(Arrays.asList(arr));
        System.out.println("ArrayList subclass of List interface "+NotLinked);

        List<String> linked = new LinkedList<>(Arrays.asList(arr));
        System.out.println("LinkedList subclacc of List interface "+linked);

        Vector<Integer> vt = new Vector<>();
        vt.add(1);

        System.out.println("=============================================");

        Stack<Integer> stack = new Stack<>();
        stack.add(1);
        stack.add(2);
        stack.add(3);
        stack.add(4);

        System.out.println(stack.pop());// pop() method of Stack class prints the last element and removes it from the List

        System.out.println(stack);//after pop() method above now element 4 is removed from the Stack
    }

}
