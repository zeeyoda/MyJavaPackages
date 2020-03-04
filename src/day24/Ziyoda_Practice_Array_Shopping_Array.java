package day24;

public class Ziyoda_Practice_Array_Shopping_Array {
    public static void main(String[] args) {
        String[] fruit = {"apple","banana","grape","strawberry","blueberry","kiwi"};
        int fruitCount = fruit.length;
        int lastFruitIndex = fruit.length-1;
        String lastFruit = fruit[fruit.length-1];

        for (String eachFruit: fruit) {
            System.out.println(eachFruit);
            if(!eachFruit.equals(lastFruit)){
                System.out.println("-->>");
            }


        }

    }
}
