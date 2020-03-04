package muhtar50_Abstraction;

public abstract class Animal {
    char gender;
    int age;
    String color;
    String name;

    public Animal(char gender, int age, String color, String name) {
        this.gender = gender;
        this.age = age;
        this.color = color;
        this.name = name;
    }
        public abstract void speak();
        public abstract void eat();
        public abstract void sleep();
        public abstract void drink();

    }


