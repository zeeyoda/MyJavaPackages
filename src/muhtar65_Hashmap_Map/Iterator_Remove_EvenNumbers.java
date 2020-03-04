package muhtar65_Hashmap_Map;

import com.sun.jdi.Value;

import java.util.*;

public class Iterator_Remove_EvenNumbers {
    public static void main(String[] args) {

       //below code removes all the odd numbers from the List
        List<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(20, 45, 78, 98, 33, 56, 20, 27, 45, 98, 74, 36, 99, 20, 45, 21));
        Iterator<Integer> it = list1.iterator();
        while(it.hasNext()){
            int c = it.next();
            if(c%2==1){
                it.remove();
            }
        }
        System.out.println("Removing the odd numbers using while loop and iterator "+list1);

        for(Iterator<Integer> removeList = list1.iterator(); removeList.hasNext();){
            int a = removeList.next();
            if(a % 2 == 1){
                removeList.remove();
            }
        }
        System.out.println("Removing the odd number using for loop and iterator "+list1);

        //below program removes all the even numbers from the list
        List<Integer>  list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(65, 89, 32, 12, 45, 78, 85, 25, 26, 24));
        for(Iterator<Integer> removeL2 = list2.iterator(); removeL2.hasNext();){
        int b = removeL2.next();
        if(b%2==0) {
            removeL2.remove();
        }
        }
        System.out.println("Removing even numbers using for loop "+list2);

        Iterator<Integer> nums = list2.iterator();
        while(nums.hasNext()){
            int d = nums.next();
            if(d%2==0){
                nums.remove();
            }
        }
        System.out.println("Removing all the even numbers using while loop "+list2);


        int[] num = {20, 45, 78, 98, 33, 56, 20, 27, 45, 98, 74, 36, 99, 20, 45, 21};
        List<Integer> numList= new ArrayList<>();
        for (int x = 0; x < num.length; x++) {
            numList.add(num[x]);
        }
        System.out.println("numList = " + numList);
        for(Iterator<Integer> numRemove = numList.iterator(); numRemove.hasNext();){
            int x = numRemove.next();
            if(x==20 || x==45) {
                numRemove.remove();
            }
        }
        System.out.println("Practice with Betul "+numList);
    }
}
