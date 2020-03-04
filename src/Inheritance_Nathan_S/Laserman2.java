package Inheritance_Nathan_S;

public class Laserman2 extends Character2 {
    int numCharges;

    public Laserman2(String n, int lvl, int charge){

        super(n, lvl);
        System.out.println("Laserman2 Constructor");
        numCharges = charge;
    }

    public int getCharges(){
        return numCharges;
    }
}
