package muhtar_Day37;

public class Dog_Objects {

    public static void main(String[] args) {

        Dog dog1 = new Dog();
        System.out.println(dog1);//it will print null because we have not initialized any attributes for this object

        dog1.breed = "Husky";
        dog1.size = "Large";
        dog1.color = "grey and white";
        dog1.name = "Molly";
        dog1.gender = 'F';
        dog1.age = 7;
        System.out.println(dog1.breed);
        dog1.sleep();
        dog1.getInfo();

    }
}
