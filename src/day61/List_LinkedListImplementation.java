package day61;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class List_LinkedListImplementation {
    public static void main(String[] args) {

        //ArrayList is backed by array in the background
        //so if we have ArrayList with 4 elements
        //in the background we have array wit size 4 holding those elements

        //if you add one item to the list using add method
        //it will create an array with size 5 then copy for all for above
        //and add the new item at the end

       // List<String> lst = new ArrayList<>();

        //LinkedList is backed by something called Node
        //see it has 4 people holding hands
        //the neighboring person have pointer to previous and next person
        //because they are holding hands

        //if you want to add one person
        //new person will just have to hold last person's hand
        //if you want to insert in the middle
        //new person just need to hold previous and next person's hand
        List<String> lst = new LinkedList<>();
        lst.add("Zeynep");
        lst.add("Saida");
        lst.add("Adil");
        lst.add("Azat");
        lst.add("Saida");
        System.out.println("lst= "+ lst);

        lst.remove("Zeynep");
        System.out.println("lst = "+ lst);
        lst.add(2, "No Saida");
        System.out.println(lst);

    }
}
