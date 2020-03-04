package Collections_Framework.List;

import java.util.ArrayList;

public class ArrayListConcept {
    public static void main(String[] args) {

        ArrayList ar = new ArrayList();

        ar.add(10);
        ar.add(20);
        ar.add(30);
        System.out.println(ar.size());

        ar.add(12.05);
        ar.add("Java");
        ar.add("Test");
        ar.add('a');
        ar.add(true);
        System.out.println(ar.size());//getting the size/length of an arraylist

        //print all the values from ArrayList
        //1. for loop
        //2.using iterator

        for (int i = 0; i <ar.size() ; i++) {
            System.out.println(ar.get(i));

        }
        //non generic vs generic ArrayList:

        ArrayList<Integer> ar1 = new ArrayList<>();//non generic arraylist only takes objects of s specified type
        ar1.add(100);
       // ar1.add("sun");--> ar1 will take take this as it is not an Integer
        //iterator to traverse/loop through the elements/values

    }
}
