package ziyodaPractice;

import java.util.ArrayList;

public class Repl_214 {
    public static String search(ArrayList<String> r, String find)
    {
        for (String each: r) {
            if (each.contains(find)) {
                return each;
            }


        }

        return "search failed";

    }

    public static void main(String[] args)
    {

        ArrayList<String> arr = new ArrayList<>();
        arr.add("2");
        arr.add("6");
        arr.add("foo bar");
        arr.add("abc");


        String find_tst = search(arr,"foo");
        System.out.print(find_tst);//foo bar


    }//end main
}

