package OfficeHour;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static java.util.Arrays.asList;

public class Office_Hour_01_09 {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>();

        nums.add(5);

        List<String> list2 = new ArrayList<>();
        list2.add("A");
        list2.add(0, "B");

        boolean result = list2.contains("C");
        System.out.println(result);
        System.out.println(list2.contains("C"));

        System.out.println(list2.indexOf("B"));

        List<Integer> list3 = new ArrayList<>();
        list3.add(23);
        list3.add(45);
        list3.add(85);

        Integer a1 = 1;

        boolean r1 = list3.remove(a1);
        System.out.println(list3);
        System.out.println(r1);

        List<String> list4 = new ArrayList<>();
        list4.add("A");
        list4.add("B");
        list4.add("C");
        list4.add("D");
        list4.add("E");

        list4.remove(2);
        System.out.println(list4);
        list4.remove("B");

        Integer[] num = {1, 2, 3, 4, 5, 6};
        List<Integer> list5 = Arrays.asList(num);
        System.out.println(list5);

        String[] students = {"Ziyoda", "Zubayda", "Aziza", "Iroda"};
        //List<String> names = new ArrayList<>(Arrays.asList(students)); ---> this is more direct way yo copy arr to List
        List<String> names = new ArrayList<>();
        names.addAll(Arrays.asList(students));
        names.addAll(Arrays.asList("Adil", "Azat", "Saida", "Sabira"));
        System.out.println(names);

        List<String> grades = new ArrayList<>();
        grades.addAll(Arrays.asList("A","B","A","C","D","E","F"));

        grades.removeAll(Arrays.asList("A", "C"));
        System.out.println(grades);

        List<String> cars = new ArrayList<>();
        cars.addAll(Arrays.asList("BMW", "Toyota", "Tesla","Jaguar", "Honda", "BMW"));

        cars.retainAll(Arrays.asList("BMW","Jaguar","Tesla"));
        System.out.println(cars);

        List<String> employees = new ArrayList<>();
        employees.addAll(Arrays.asList("Ahmet","John","Ahmet","Aaron","Eric","Ahmet"));
        employees.removeAll(Arrays.asList("Ahmet"));
        System.out.println(employees);

        List<Integer> nums2 = new ArrayList<>(Arrays.asList(9,8,7,6,5,4,3,2,1));
        Collections.sort(nums2);








    }
}
