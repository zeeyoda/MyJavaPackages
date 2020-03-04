package day49;

public class IceCream implements Edible {
    public static void main(String[] args) {
        IceCream ice = new IceCream();
        ice.drink();
        ice.eat();
        System.out.println(ice.toString());
        ice.digest();
    }
    @Override
    public void digest(){
        System.out.println("Digest ice cream by eating slowly");

    }
    @Override
    public void eat() {
        System.out.println("Eat with spoon");

    }

    @Override
    public void drink() {
        System.out.println("If it is milkshake, drink it.");

    }
}
