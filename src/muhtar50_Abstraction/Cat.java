package muhtar50_Abstraction;

public class Cat extends Animal {

    public Cat(char gender, int age, String color, String name){
        super(gender, age, color, name);
    }
    @Override
    public void speak(){
        System.out.println("Meow");
    }
    @Override
    public void sleep(){
        System.out.println("My cat sleeps 14 hours a day");
    }
    @Override
    public void eat(){
        System.out.println("My cat likes to eat fish.");
    }
    public void drink(){
        System.out.println("My cat likes to drink milk very much.");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "gender=" + gender +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
