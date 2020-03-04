package muhtar50_Abstraction;

import jdk.swing.interop.SwingInterOpUtils;

public class Dog extends Animal {

    public Dog(char gender, int age, String color, String name){
        super(gender, age, color, name);
    }

    @Override
    public void eat(){
        System.out.println("My dog likes KFC");

    }
    @Override
    public void sleep(){
        System.out.println("Dog sleeps eight hours a day");

    }
    @Override
    public void drink(){
        System.out.println("My dog lives milkshakes");

    }
    @Override
    public void speak(){
        System.out.println("Woof");

    }

    @Override
    public String toString() {
        return "Dog{" +
                "gender=" + gender +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
