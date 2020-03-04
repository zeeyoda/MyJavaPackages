package day43;

public class Coffee {
    private String type;
    private int caffLevel;
    private double price;

    public Coffee(){
        System.out.println("This is a no arg constructor");
    }
    public Coffee(String type, int caffLevel){
        this.type = type;
        this.caffLevel = caffLevel;
        System.out.println("2 args are being called");
    }
    public Coffee(String type, int caffLevel, double price) {
        this.type = type;
        this.caffLevel = caffLevel;
        setPrice(price);

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCaffLevel() {
        return caffLevel;
    }

    public void setCaffLevel(int caffLevel) {
        this.caffLevel = caffLevel;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price>0) {
            this.price = price;
        }
        if(this.price<=0){
            price = 1;
        }
    }


    public String toString() {
        return "Coffee{" +
                "type='" + type + '\'' +
                ", caffLevel=" + caffLevel +
                ", price=" + price +
                '}';
    }
}
