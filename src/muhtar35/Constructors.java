package muhtar35;


public class Constructors {
    public static void main(String[] args) {
        Constructors obj = new Constructors(100);
        Constructors obj1 = new Constructors(true);
    }

    public Constructors(int a){
        System.out.println("Constructor with argument: "+a);

    }
    public Constructors(boolean a){
        this(100);
        System.out.println("This is one argument constructor "+a);
    }
}
