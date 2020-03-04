package Inheritance_Nathan_S;

public class Inheritance105 {
    public static void main(String[] args) {

        Character5 c5 = new Character5("Ziyoda", 15);
        System.out.println(c5.toString());
        c5.outputStuff();
        Laserman5 l5 = new Laserman5("Azat", 9, 11);

        l5.outputStuff();
        System.out.println(l5.toString());

    }
}
