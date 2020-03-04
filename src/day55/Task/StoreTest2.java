package day55.Task;

import java.util.Arrays;
import java.util.List;

public class StoreTest2 {
    public static void main(String[] args) {
        List<Product> denisList = Arrays.asList((new Product("cookie", 3 )),
                (new Product("tea", 3)),
                (new Product("coffee", 5)),
                (new Product("bagel", 2)));

        Store s2 = new Store("Denis", denisList);
        System.out.println("s2 = " + s2);

        Product p1 = new Product("Cake", 10);
        s2.addProduct(p1);
        System.out.println("s2 = " + s2);
        System.out.println("Get product count "+s2.getProductCount());
        s2.displayProducts();
        s2.removeProduct(p1);
        System.out.println("Check if a cake that costs $10 exists "+s2.checkIfProductExists(p1));

        System.out.println("Index of cake "+s2.indexOfProduct(p1));
        s2.removeProduct(p1);

        System.out.println(s2.sumOfPrice());

        System.out.println(s2.getAverage());
    }
}
