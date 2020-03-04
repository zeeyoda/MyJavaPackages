package day53;

public class FruitShopUtility {

    public static void main(String[] args) {
        Fruit f1 = new Orange("sour", "orange", 12);
        Fruit f2 = new Apple("crispy", "yellow", "Gala");

        displayFruit(f1);
        displayFruit(f2);

        displayFruit(new Apple("tasteless", "red", "Golden"));

        digestBetter(f2);
    }

    public static void digestBetter(Fruit fruit){
        fruit.getDigested();
        fruit.getDigested();
        fruit.getDigested();
        fruit.getDigested();
    }

    public static void displayFruit(Fruit anyFruit){

        System.out.println("Displaying fruit \n"+anyFruit);

    }
    public void sellFruit(){

    }

    public void buyFruit(){

    }
}
