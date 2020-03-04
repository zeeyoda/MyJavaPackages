package muhtar50_Abstraction;

public class Cow extends Animal {

    public Cow(char gender, int age, String color, String name){
        super(gender, age, color, name);
     }
     @Override
     public void speak(){
         System.out.println("Cow says moo");
     }
     @Override
     public void sleep(){
         System.out.println("Cow sleeps 5 hours a day.");
     }
     @Override
     public void eat(){
         System.out.println("Cow east grass all the time.");
     }
     @Override
     public void drink(){
         System.out.println("Cow drinks water from the creek.");
     }

    @Override
    public String toString() {
        return "Cow{" +
                "gender=" + gender +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
