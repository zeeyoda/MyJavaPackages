package muhtar49;

public abstract class Abstraction {

   public abstract void startTheCar();
}
class Toyota extends Abstraction{
    @Override
    public void startTheCar(){
        System.out.println("Hit the break");
        System.out.println("Push the start button");
        System.out.println("Release the break");

    }
    public static void main(String[] args) {
        //Abstraction a1 = new Abstraction(); --> cannot do this, compiler gives an error
    }


    }
class Tesla extends Abstraction{
    @Override
    public void startTheCar(){
        System.out.println("Vice Control");
        System.out.println("Drive");
        System.out.println("Play music");

    }
}
