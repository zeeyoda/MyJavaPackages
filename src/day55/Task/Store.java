package day55.Task;

import java.util.ArrayList;
import java.util.List;

public class Store {
    String name;
    private List<Product> list;

    public List<Product> getMoreThanAveragePriceListProducts(){
        List<Product> myList = new ArrayList<>();
        int average = getAverage();
        for (Product each: list) {
            if(each.getPrice()>average){
               myList.add(each);
            }
        }
        return myList;
    }

    public int maxPrice() {
        //  int maxP =  list.get(0).getPrice();
        int maxP = Integer.MAX_VALUE;

        for (Product each : list) {
            if (each.getPrice() > maxP) {
                maxP = each.getPrice();
            }
        }
        return maxP;
//       int maxIndex = -1;
//       for (int x = 0; x < list.size(); x++) {
//           if (list.get(x).getPrice() > maxP) {
//               maxP = list.get(x).getPrice();
//           }
//           return maxP;
//
//       }
    }


    public int getAverage() {
        double average = 0.0;
        return sumOfPrice() / getProductCount(); //or we can also do sumOfPrice()/list.size();
    }

    public int sumOfPrice() {
        int sum = 0;
        for (Product each : list) {
            sum += each.getPrice();

        }
        return sum;
    }


    public void removeProduct(Product p) {
        if (checkIfProductExists(p) == true) {
            list.remove(p);
        } else {
            System.out.println("We don't have " + p);
        }

    }

    public int indexOfProduct(Product p) {
        return list.indexOf(p);

    }

    public boolean checkIfProductExists(Product p) {

        return list.contains(p);
    }

    public void displayProducts() {
        System.out.println(name + "'s Store has below products: ");
        for (Product each : list) {
            System.out.println("\t each = " + each);

        }
    }

    public int getProductCount() {
        return list.size();
    }

    public void addProduct(Product p) {
        System.out.println("Calling addProduct(Product p)");
        list.add(p);
    }

    public void addProduct(String productName, int producePrice) {
        Product newP = new Product(productName, producePrice);
        list.add(newP);
    }


    public Store() {
        this.name = "Cybertek Store.";
        this.list = new ArrayList<>();

    }

    @Override
    public String toString() {
        return "Store{" +
                "name='" + name + '\'' +
                ", list=" + list +
                '}';
    }

    public Store(String name, List<Product> otherList) {
        this();// calling no arg constructor here
        this.name = name;
        this.list.addAll(otherList);


    }
}




