package muhtar64.Queue.Iterator;

import java.util.*;

public class Iterable_InterFace {

    //most important methods are
    //iterator()
    //hasNext()
    //next()
    //remove()

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,1,1,1,2,3,4,5,6,7));

        for(int x=0; x<list.size(); x++){
            if(list.get(x)==1){
                list.remove(list.get(x));
            }
        }
        System.out.println(list);
        System.out.println("======================================================");

        List<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1));//,1,1,1,2,3,4,5,6,7

        Iterator<Integer> it = list2.iterator();
        boolean a = it.hasNext();
        System.out.println(a);

        System.out.println(it.next());
        boolean b = it.hasNext();
        System.out.println(b);
        //System.out.println(it.next());// this will give us exception as there is not enough data elements that can be iterated

        List<Integer> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList(1,1,1,1,2,3,4,5,6,7,1,1,1,1));
        //remove all elements that are equal to 1
        Iterator<Integer> it2 = list3.iterator();
        while(it2.hasNext()){
//            int num = it2.next();
//            if(num==1){
           if(it2.next()==1){
               it2.remove();
           }

        }
        System.out.println(list3);
        System.out.println("==========================================================");

        Set<Integer> set = new LinkedHashSet<>();
        set.addAll(Arrays.asList(10,20));

        Iterator<Integer> iterate = set.iterator();
        System.out.println(iterate.hasNext());//true
        System.out.println(iterate.next());

        System.out.println(iterate.hasNext());//true
        System.out.println(iterate.next());

        System.out.println("=================================================");
        String[] name = {"Erhan", "Eholly","Nadire","Yusuf","Ibrohim","Tarbiz"};
        //Remove Erhan from the String array
        Set<String> names = new LinkedHashSet<>();
        names.addAll(Arrays.asList(name));
        System.out.println(names);
        Iterator<String> itString = names.iterator();

//        while(itString.hasNext()){
//            String str = itString.next();
//            if(str.equals("Erhan")) {
//                itString.remove();
//            }
//        }
//        System.out.println(names);
        while(itString.hasNext()){
            String str2 = itString.next();
            if(str2.toLowerCase().contains("e")){
                itString.remove();
            }
        }
        System.out.println(names);
        System.out.println("==============================================");
        //for(initialization; condition; iterator);

        List<Integer> myList = new ArrayList<>();
        myList.addAll(Arrays.asList(100,900,500,99,200,89,300,79));
        for (Iterator<Integer> itr = myList.iterator(); itr.hasNext();) {
            if(itr.next()>100){
                itr.remove();

            }

        }
        System.out.println(myList);
        System.out.println("==================================================================");
        String[] students = {"Erhan","Erhan", "Erhan", "Aijamal","Safwan","Madina","Erhan","Erhan"};
        List<String> studentList = new ArrayList<>();
        studentList.addAll(Arrays.asList(students));
        Iterator<String> erhanRemove = studentList.iterator();
        while(erhanRemove.hasNext()) {
            if (erhanRemove.next().equals("Erhan")) {
                erhanRemove.remove();
            }
        }

//        for(Iterator<String> removal = studentList.iterator(); removal.hasNext();){
//            String string = removal.next();
//            if(string.equals("Erhan") || string.equals("Madina")){
//                removal.remove();
//            }
//
//        }
        System.out.println(studentList);

        //int[] nums = {20, 45, 78, 98, 56, 20, 45, 98, 74, 36, 45};
        int[] nums = {20, 45, 78, 98, 56, 20, 45, 98, 74, 36, 20, 45};






    }

}
