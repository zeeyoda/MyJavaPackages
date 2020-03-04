package day49;

//you are building super-sub relationship, IS-A relationship
public class Burger implements Edible, Juicy {

    //public static final boolean IS_HUMAN_FOOD = true;
//    public Burger(){
//        super();
//    }

    @Override
    public void melt() {

    }

    @Override
    public void eat() {
        System.out.println("Eat burger with appetite");

    }

    @Override
    public void drink() {
        System.out.println("Drink soda");

    }
}
