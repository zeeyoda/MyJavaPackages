package muhtar35;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayToArrayList {
    public static void main(String[] args) {
        int[] arr = {12, 45, 78, 96};
        ArrayList<Integer> list = arrayToArrayList(arr);
        System.out.println(list);

        String[] geeks = {"Tom","Jenna","Molly"};
        ArrayList<String> names = arrayToArrayListString(geeks);
        System.out.println(names);

        double[] doubles = {12.5, 45.5, 6.3, 8.03};
        ArrayList<Double> dls = arrToDoubleList(doubles);
        System.out.println(dls);
        char[] char2 = {'m','o','o','k','i','e'};
        ArrayList<Character> charList = arrToCharacterList(char2);
        System.out.println(charList);

    }
    public static ArrayList<Character> arrToCharacterList(char[] char1){
        ArrayList<Character> charLst = new ArrayList<>();
        for(char each: char1){
            charLst.add(each);
        }
        return charLst;
    }
    public static ArrayList<Double> arrToDoubleList(double [] arr){
        ArrayList<Double> doubles = new ArrayList<>();
        for(double each: arr){
            doubles.add(each);
        }
        return doubles;
    }
    public static ArrayList<Integer>arrayToArrayList(int[]arr) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int each : arr) {
            list.add(each);
        }
        return list;
    }
        public static ArrayList<String> arrayToArrayListString(String[] str){
        ArrayList<String> list1 = new ArrayList<>();
        for(String eachStr: str){
            list1.add(eachStr);
        }
        return list1;
    }

}
