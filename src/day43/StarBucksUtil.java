package day43;

public class StarBucksUtil {
    public static void main(String[] args) {
        Coffee c = new Coffee("Blonde", 5, 1.6);
         Coffee c1 = new Coffee();
        printCoffeeIntro(c1);
        printCoffeeIntro(new Coffee("Intensito", 10));


    }
    public static void printCoffeeIntro(Coffee coffee){
        System.out.println(coffee.getType());
        System.out.println(coffee.getPrice());
        System.out.println(coffee.getCaffLevel());

    }
}
