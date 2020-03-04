package day24;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Ziyoda_Arrays_Equality {
    public static void main(String[] args) {
        int[]scores1 = {1, 3, 5, 8};
        int[]scores2 = {5, 8, 7, 6, 2};
        int[]scores3 = {1, 3, 5, 8};
        int[]scores4 = {5, 3, 1, 8};


        System.out.println( scores1==scores2);
        System.out.println(scores1==scores3);

        boolean isS1S2Equal = Arrays.equals(scores1, scores2);
        System.out.println(isS1S2Equal);

        Arrays.sort(scores3);
        Arrays.sort(scores4);
        System.out.println("After sorting does scores 3 have the same content and order as score 4: "+
                            Arrays.equals(scores3, scores4));
    }
}
