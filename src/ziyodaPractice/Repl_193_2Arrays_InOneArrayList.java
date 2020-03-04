package ziyodaPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Repl_193_2Arrays_InOneArrayList {
    public static void main(String[] args) {
        String[] r1 = {"f","o","o"};
        String[] r2 = {" b","a","r"};

        List<String> combined = new ArrayList<>(Arrays.asList(r1));
        combined.addAll(Arrays.asList(r2));

        String inString = "";
        for (int i = 0; i < combined.size(); i++) {
            inString += ""+combined.get(i);

        }
        System.out.println(inString);


       /* List<String> both = new ArrayList<>(Arrays.asList(r1));
        both.addAll(Arrays.asList(r2));

        Object[] combined = both.toArray();
        System.out.println(Arrays.toString(combined));
        */




    }
}
