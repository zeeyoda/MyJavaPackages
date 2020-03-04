package day44;

public class Laserman extends Character_1 {
    private int numCharges;

    public Laserman(){
        System.out.println("Laserman Constructor");
        numCharges = 100;
    }
    public int getCharges(){
        return numCharges;
    }
}
