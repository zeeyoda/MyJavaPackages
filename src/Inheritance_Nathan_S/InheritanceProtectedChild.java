package Inheritance_Nathan_S;

public class InheritanceProtectedChild extends InheritanceProtectedParent{
    private int numCharges;

    public InheritanceProtectedChild(String n, int lvl, int charges){
        super(n, lvl);
        numCharges = charges;
    }
    public int getCharges(){
        return numCharges;
    }
    public void outputInfo(){
        System.out.println("Name                   :: "+getName());
        System.out.println("Level                  :: "+getLevel());
        System.out.println("Number of Charges      :: "+numCharges);
    }
}
