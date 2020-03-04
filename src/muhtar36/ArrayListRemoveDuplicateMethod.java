package muhtar36;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListRemoveDuplicateMethod {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(12, 15, 17, 15, 12, 17, 95, 95));

        System.out.println(removeDup(list));
        String[] str = {"Sabira", "Saida","Azat","Adil","Sabira","Saida","Adil","Azat"};

        ArrayList<String> str1 = new ArrayList<>();

    }
    public static ArrayList<Integer> removeDup(ArrayList<Integer> arr){
        ArrayList<Integer> result = new ArrayList<>();
        for (Integer each:arr ) {
            if(!result.contains(each)){
                result.add(each);
            }

        }
        return result;
    }
    public static ArrayList<String> removeDup2(ArrayList<String> str){
        ArrayList<String> result = new ArrayList<>();
        for (String each:str) {
            if(!result.contains(each)){
                result.add(each);
            }

        }

        return result;
    }

}
