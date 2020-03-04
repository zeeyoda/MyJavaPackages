package day37;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_Remove_Item_Practice {
    public static void main(String[] args) {
        List<Integer> lst = new ArrayList<>();
        lst.add(2);
        lst.add(14);
        lst.add(34);
        lst.add(41);
        lst.add(19);
        System.out.println("lst = " + lst);
        // this will remove by index
        lst.remove(3);
        System.out.println("lst = " + lst);

        //we want to remove object/value not index
      //  lst.remove(new Integer(2));
          lst.remove(Integer.valueOf(2));
        System.out.println("lst = " + lst);

        //if you try to delete an item that does not exist by value
        //it will do nothing
        lst.remove(Integer.valueOf(122));
        System.out.println("lst = "+ lst);

        //if you try to delete by the index that doesn't exist on the list
        //it will throw IndexOutOfBoundException
        //lst.remove(122);




    }
}
