package day49;

//Interface can achieve loosely coupling between implementing classes
//example: When we say flyable:
//all the implementing classes like Plane, Insects, Superman
//can be all Flyable and has nothing to do with each other
//and almost no knowledge about each other: known as loosely coupling
//This is why it's always preferred in design
public interface Juicy {

    public abstract void melt();

    //another type of method interface can have is:
    //static method, it must have body
    //and it's there to provide sme utility methods
    //that does not belong to any class
    //STATIC METHODS of interface are NOT INHERITED
    //it must have a body

    public static void squeeze(){
        System.out.println("Static squeezing");
    }
}
