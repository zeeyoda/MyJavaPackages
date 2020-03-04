package muhtar64.Queue.Iterator;

import java.util.ArrayDeque;
import java.util.Deque;

public class DeQueInterFace {
    //has the following methods
    //addFirst(object)
    //removeFirst(o); 0==object
    //removeLast(o);
    //getFirst(o);
    //getLast(o);
    public static void main(String[] args) {
        Deque<Integer> dq = new ArrayDeque<Integer>();
        dq.addFirst(10);
        dq.addFirst(20);
        dq.addFirst(30);

        dq.addLast(40);
        System.out.println(dq);
        dq.addLast(5);
        dq.addLast(4);
        dq.addLast(3);
        dq.addLast(2);

        System.out.println(dq);

        dq.removeFirst();
        System.out.println("First item is removed "+dq);

        dq.removeLast();
        System.out.println("Last item is removed "+dq);

        System.out.println("getFirst() getting first object = "+dq.getFirst());//getFirst() retrieves the first object from  Deque

        System.out.println("getLast() getting the last object = "+dq.getLast());//getLast() retrieves the last object from the Deque


    }

}
