package Inheritance_Nathan_S;

public class Laserman5 extends Character5 {
    private int numCharges;

    public Laserman5(String n, int lvl, int charge){
        super(n, lvl);
        numCharges = charge;

    }
    public void outputInfo(){
        System.out.println("Number of Charges: "+numCharges);
    }
    public int getCharges(){
        return numCharges;

    }
    public void outputStuff(){
        System.out.println("This is from  the Subclass");
    }
    public String toString(){
        String out = super.toString()+"\nNumCharges :: "+numCharges;
        return out;

    }
}
