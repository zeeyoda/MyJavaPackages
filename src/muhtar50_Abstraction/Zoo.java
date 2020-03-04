package muhtar50_Abstraction;

import java.util.Arrays;
import java.util.List;

public class Zoo {
    public static void main(String[] args) {

        Cat c1 = new Cat('F', 10, "Grey", "Kitty" );
        c1.drink();
        c1.eat();
        c1.sleep();
        c1.speak();
        System.out.println(c1);

        Cow cow = new Cow('M', 15, "Black", "Milky");
        System.out.println(cow);

        Dog dog = new Dog('M', 1,"Brown", "Mookie");
        System.out.println(dog);
        System.out.println("======================================");
        List<Animal> allAnimals = Arrays.asList(c1, cow, dog);
        System.out.println(allAnimals);
        for (Animal each:allAnimals) {
            System.out.println("each "+each);

        }

    }
}
