package day54;

public class AnimalShow {
    public static void main(String[] args) {

        Dog d1 = new Dog();
        Dog d2 = d1;
        Animal d3 = new Dog();

        Object obj = new Dog();
        Object obj2 = d1;

        IndoorPet d4 = new Dog();
    }
}
