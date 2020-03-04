package day53;

public class Pepper extends Vegetables {

    int num;
    String name;

    public Pepper(String color, String taste, int n, String name) {
        super(color, taste);
        num = n;
        this.name = name;
    }

    @Override
    public void cook() {
        System.out.println("I am cooking "+num+" "+color+" peppers. They are "+taste+".");

    }

    @Override
    public void pick() {
        System.out.println("I like to pick "+name+" from the vegetable garden.");

    }

    public void dip(){
        System.out.println("I like dipping "+name+" in ranch sauce.");
    }

    @Override
    public String toString() {
        return "Pepper{" +
                "num=" + num +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", taste='" + taste + '\'' +
                '}';
    }
}
