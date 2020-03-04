package day55.Task;

public class ProductTest {
    public static void main(String[] args) {

        Product p1 = new Product("Macbook", 2000);

        Product p2 = new Product("Sony TV", 745);

        Product p3 = new Product("Sony TV", 745);

        System.out.println(p1==p2);
        System.out.println(p2==p3);
        System.out.println(p2==p2);

        Product p4 = p3;
        System.out.println(p4==p3);
        //equals() method is coming from the Object class
        //Product extends Object so Product has equals method
        //inherited
        System.out.println(p2.equals(p3));



    }
}
