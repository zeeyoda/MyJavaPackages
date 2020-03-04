package muhtar56;


class A{
    public void methodA(){
        System.out.println("method A");
    }
    public static void methodC(){
        System.out.println("Static method C from class A.");
    }

}
class B extends A{

    public void methodB(){
        System.out.println("method B");
    }
    public void methodA(){
        System.out.println("Method A in method B.");
    }
    public static void methodC(){
        System.out.println("Method C from class B.");
    }

}
abstract class C implements E{

}
class D extends C implements E{

}
interface E{

}

public class PolymorphismReview {
    public static void main(String[] args) {
        A b1 = new A();

        A b2 = new B();
        b2.methodA();//overridden method being called by the object from the B class
        b2.methodC();

        C obj = new D();
        E obj1 = new D();

    }

}
