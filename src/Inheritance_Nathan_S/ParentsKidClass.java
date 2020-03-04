package Inheritance_Nathan_S;

import com.sun.security.jgss.GSSUtil;

public class ParentsKidClass extends ParentClass{
    private int numCharges;

    public ParentsKidClass(String n, int lvl, int charge){
        super(n, lvl);
        numCharges = charge;
    }
    public void outputInfo(){
        System.out.println("Name             :: "+getName());
        System.out.println("Level            :: "+getLevel());
        System.out.println("Number of Charges:: "+numCharges);
    }
}
