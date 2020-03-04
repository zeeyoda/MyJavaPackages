package day55;

public class Casting {
    public static void main(String[] args) {

        int x = 10;
        long y = x; //upcasting; works implicitly | automatically
        byte b = (byte) x; // needs to be casted explicitly

        Object o = new Dog("Cavapoo");
        //o.bark;
        Dog d = (Dog) o;// this is downcasting from type Object to Dog
        d.bark();

        Dog d1 = new Dog("Pitbull");//this is a new object

        //in order to let the Dog object bark, we need to refer to a dog as a Dog or we dont
        //get access to Dog only actions
    }
}
