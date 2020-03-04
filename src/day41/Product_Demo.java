package day41;

public class Product_Demo {
    public static void main(String[] args) {

        Product p1 = new Product();

        p1.setName("iPhone");
        p1.setPrice(699);

        //I want to store the price
        double myPrice = p1.getPrice();
        System.out.println("Hello World");
        System.out.println("myPrice = " + myPrice);
    }
}
