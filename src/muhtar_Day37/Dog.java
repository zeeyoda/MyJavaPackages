package muhtar_Day37;

public class Dog {

    String breed;
    String size;
    byte age;
    String color;
    String name;
    char gender;

    public void eat(){
        System.out.println("My "+breed+" likes to eat");

    }
    public void sleep(){
        eat();
        System.out.println(name+" loves to sleep.");
    }
    public void getInfo(){
        System.out.println(breed+" is "+size+". It is "+age+" years old.");
    }
}
