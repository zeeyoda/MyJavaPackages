package Inheritance_Nathan_S;

public class ParentClass {
    private String name;
    private int level;

    public ParentClass(String n, int lvl){
        name = n;
        level = lvl;
    }
    public String getName(){
        return name;
    }
    public int getLevel(){
        return level;
    }
}
