package day43;

public class Fruit {
    String name;
    String color;
    double price;

    public Fruit() {
        System.out.println("This is a no arg constructor for fruit class");
    }
    public Fruit(String name, String color, double price){
        this.name = name;
        this.color = color;
        setPrice(price);
       // System.out.println("This is a three arg constructor");
    }
    public Fruit(String name, String color){
        this.name = name;
        this.color = color;
    }
    public void eat(){
        switch (color.toLowerCase()){
            case "red":
                System.out.println("Wash and eat it");
                break;
            case "yellow":
                System.out.println("Peel and eat it");
                break;
            case "green":
                System.out.println("Cut it in half and eat it");
                break;
            default:
                System.out.println("Don't eat that apple");
        }
    }
    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
       if(price>=5) {
           this.price = price;
       }else if(price>=0 && price<5){
           price = 3;
       }
    }
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
