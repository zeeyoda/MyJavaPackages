package muhtar52;

public abstract class Chain {

    public abstract void chainMethod();
    public abstract void chain();
}
 abstract class Plain extends Chain{

    public void chainMethod(){
        System.out.println("I am overriding super class abstract method");
    }
    public abstract void ring();

}
 final class Claim extends Plain{
    @Override
    public void ring(){
        System.out.println("This is a ring method overridden from Plain class");
    }
    public void chain(){
        System.out.println("This is a overridden chain method from Chain abstract class");
    }

}
class TestAllCLasses{
    public static void main(String[] args) {
        Claim cl = new Claim();
        cl.ring();
        cl.chain();
        cl.chainMethod();
    }
}
