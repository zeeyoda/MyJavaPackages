package day53;

public class Broccoli extends Vegetables {
    String type;

    public Broccoli(String color, String taste, String type) {

        super(color, taste);
        this.type = type;
    }

    @Override
    public void cook() {
        System.out.println(type+" is "+color+". It has a "+taste+" taste.");

    }

    @Override
    public void pick(){
        System.out.println("I picked some "+color+" "+type+".");

    }
    public void steam(){
        System.out.println("I am cooking "+type+".");
    }

    @Override
    public String toString() {
        return "Broccoli{" +
                "type='" + type + '\'' +
                ", color='" + color + '\'' +
                ", taste='" + taste + '\'' +
                '}';
    }
}
