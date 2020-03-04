package muhtar49;

public abstract class Animal {

    public abstract void eat();
    public abstract void sleep();

    }
    class Cat extends Animal{
    @Override
    public void eat(){
        System.out.println("Cat likes to eat fish");

    }
    @Override
    public void sleep(){
        System.out.println("Cat likes to sleep in the sun");

    }
    }
    class Tiger extends Animal{
    @Override
    public void eat(){
        System.out.println("Tiger eats deer");

    }
    @Override
    public void sleep(){
        System.out.println("Tiger sleeps in the bushes");

    }
    }
    class Test{
        public static void main(String[] args) {
            Cat c1 = new Cat();
            c1.eat();

            Tiger t1 = new Tiger();
            t1.sleep();
        }
    }
