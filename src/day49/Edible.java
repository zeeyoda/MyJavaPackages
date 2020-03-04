package day49;



//Interface is like a contact,
// once someone signs a contract he/she will provide all the details that he/she must do
public interface  Edible {


    //in interface fields are automatically public static final if not defined so.
    //public static final field naming convention is ALL_CAPS.
    //you can have as many constants as you want

    public static final boolean IS_HUMAN_FOOD = true;

    //if a method with no body is not defined public abstract, it's automatically public abstract
     void eat();
    public abstract void drink();
    public default void digest(){
        System.out.println("Walk to digest it all");
    }



}
