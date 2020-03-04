package day55.Task;

import java.util.ArrayList;
import java.util.List;

public class ProductListPractice {
    public static void main(String[] args) {

        List<Product> productList = new ArrayList<>();
        productList.add(new Product("Macbook", 2999));
        productList.add( new Product("Macbook Pro", 2999) ) ;
        productList.add( new Product("Sony TV", 499) ) ;
        productList.add( new Product("Macbook Air", 1299) ) ;
        productList.add( new Product("Iphone X", 999) ) ;
        productList.add( new Product("Iphone XL", 1188) ) ;
        productList.add( new Product("Sumsung 10", 1288) ) ;

        System.out.println("productList.size() = " + productList.size());

        //check whether we have "Sony TV", with 499
//        boolean result = false;
//        for (Product each: productList) {
//            if(each.getName().equals("Sony TV") && each.getPrice()==499) {
//                result = true;
//            }
//            if(each.equals(new Product("Sony TV", 499) )){
//                result = true;
//            }

//        }
        //contains method will internally call the equls method of that type (Product here)
        //if it return true then contains method will return true if not, return false;
        Product sony = new Product("Sony TV", 499);
        boolean result = productList.contains(new Product("Sony TV", 499) );
        System.out.println("Has Sony TV, with 499 or not result - "+ result);

        productList.remove(sony);
        System.out.println(productList.contains(sony));
        System.out.println(productList.indexOf(sony));



//        boolean result2 = productList.contains(sony );
//        System.out.println("Has Apple TV, with 299 or not result2 = "+ result2);





    }
}
