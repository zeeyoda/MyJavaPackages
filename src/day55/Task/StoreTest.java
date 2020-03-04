package day55.Task;

import java.util.Arrays;
import java.util.List;

public class StoreTest {
    public static void main(String[] args) {

        Store s1 = new Store();
        System.out.println(s1.name);
       // System.out.println(s1.list);
//        s1.list.add(new Product("iMac", 3999));
//        System.out.println(s1.list);

        List<Product> denisList = Arrays.asList((new Product("cookie", 3 )),
                (new Product("tea", 3)),
                (new Product("coffee", 5)),
                (new Product("bagel", 2)));

        Store s2 = new Store("Deni's Store", denisList);
        System.out.println("s2 = " + s2);
    }
}
