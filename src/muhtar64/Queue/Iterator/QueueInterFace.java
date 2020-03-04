package muhtar64.Queue.Iterator;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueInterFace {
    public static void main(String[] args) {

        //Queue(I) poll(); FIFO - first in first out

        Queue<Integer> q1 = new PriorityQueue<>();
        q1.add(10);
        q1.add(20);
        q1.add(30);
        q1.add(40);
        q1.add(50);
        q1.add(10);

        System.out.println(q1);
        int a = q1.poll();// has a return type; poll() remove first item from the element

        System.out.println(q1);
        q1.poll();
        System.out.println(q1);
        q1.poll();
        System.out.println(q1);

        Queue<String> q2 = new PriorityQueue<>();//Queue keeps elements in ascending order
        q2.add("Erhan");
        q2.add("Madina");
        q2.add("Mehribon");
        q2.add("Alla");

        System.out.println(q2);//
        q2.poll();
        System.out.println(q2);

        q2.poll();//Alla will be removed as she is the first element in ascending order


        Queue<Integer> q3 = new PriorityQueue<>();//print in sort order only if there's no duplication
        q3.add(40);
        q3.add(30);
        q3.add(20);
        q3.add(10);
        System.out.println(q3);

        q3.add(40);
        q3.add(10);
        System.out.println(q3);// if duplicate number is added it doesn't  print on ascending order

        q3.add(40);








    }
}
