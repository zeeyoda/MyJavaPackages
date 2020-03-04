package day54;

public abstract class Animal {
    public abstract void speak();

}

class Dog extends Animal implements IndoorPet{
    String name;

    public void speak(){
        System.out.println("Bark");
    }
    public void play(){
        System.out.println("Dog is playing with a ball.");
    }
}
