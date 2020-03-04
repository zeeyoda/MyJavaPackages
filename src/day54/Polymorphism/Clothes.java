package day54.Polymorphism;

public class Clothes implements Wearable, Cosmetics {

    int size;
    public void wear(){
        System.out.println("I like wearing new clothes.");
    }

    public static void main(String[] args) {
        Clothes cl = new Clothes();
        Object obj = new Clothes();
        Wearable c1 = new Clothes();
        Cosmetics c2 = new Clothes();
        System.out.println("-----------------------------------------------");

        Watch w1 = new Watch();
        Object w2 = new Watch();
        Wearable w3 = new Watch();
        System.out.println("---------------------------------------------------------");

        Perfume p1 = new Perfume();
        Object p2 = new Perfume();
        Wearable p3 = new Perfume();
        Cosmetics p4 = new Perfume();



    }


}
