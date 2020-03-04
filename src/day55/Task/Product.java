package day55.Task;

public class Product extends Object{
private String name;
private  int price;

    public Product(String n, int p){
        this.name = n;
        this.price = p;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {

        Product otherProduct = (Product) obj;
        //how to compare this name and price to whatever user passed
        return this.name.equals(otherProduct.name) && this.price==otherProduct.price;

    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
