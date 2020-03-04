package day43;

public class Starbucks {
    public static void main(String[] args) {
        Coffee c1 = new Coffee();
        c1.setType("Turkish");
        c1.setCaffLevel(8);
        c1.setPrice(-4.99);
        System.out.println("c1 = "+c1);

        Coffee c2 = new Coffee("Intensito", 9);
        System.out.println("c2 = "+c2);

        Coffee c3 = new Coffee("Blonde", 5, 1.6);
        System.out.println("c3 = "+c3);

        Coffee c4 = new Coffee("Latte",3, -2.6 );
        System.out.println("c4 = "+c4);

        double sumOfAllCoffee = c1.getPrice()+c2.getPrice()+c3.getPrice()+c4.getPrice();
        System.out.println("SumOfAllCoffee = "+sumOfAllCoffee);


    }
}
