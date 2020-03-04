package day53;

public class FruitShop {
    public static void main(String[] args) {

        Apple a1 = new Apple("sweet", "red", "fuji");
        System.out.println(a1.taste);
        System.out.println(a1.color);
        System.out.println(a1.type);

        a1.getDigested();

        System.out.println("=======================================================");
        Fruit f1 = a1;
        System.out.println("f1.color "+f1.color);
        System.out.println("f1.taste "+f1.taste);

        System.out.println("============================================================");

        f1.getDigested();
        f1 = new Orange("sour", "orange", 12);
        f1.getDigested();

        System.out.println(f1);

       // System.out.println(f1.toString());

        String str = null;
        //System.out.println(str.charAt(0));

        //Fruit reference type,  Apple object type
        Fruit f2 = new Apple("crispy", "yellow", "Gala");
        Fruit f3 = new Orange("sour", "orange", 12);
        Fruit f4 = new Orange("very sweet", "blood red", 10);

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        Fruit[] myFruit = {a1, f1, f2, f3, f4};

        for (Fruit each : myFruit) {
            each.getDigested();

        }

    }
}
