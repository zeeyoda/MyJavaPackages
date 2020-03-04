package ziyodaPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class Repl_206 {
    public static void main(String[] args) {
        ArrayList<Boolean> bools = new ArrayList<>(Arrays.asList(true, false, true));
        //System.out.println(repeatAl(true,false, true));
       repeatAl(bools);
       System.out.println(bools);

    }
    public static void repeatAl(ArrayList<Boolean> bools){
        bools.addAll(bools);
    }
}
