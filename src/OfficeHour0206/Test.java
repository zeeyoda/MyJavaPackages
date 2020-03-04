package OfficeHour0206;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        Kentucky k1 = new Kentucky();

        States s1 = new Kentucky();

        States s2 = new California();


        List<States> list = new ArrayList<>();
        list.addAll(Arrays.asList(new Kentucky(), new California()));

        String name1 = list.get(1).stateName;

        System.out.println(name1);

        States[] arr = {new Kentucky(), new California()};
    }
}
