package Inheritance_Nathan_S;

public class Character2 {
    private int level;
    private String name;

    public Character2(String n, int lvl){
        System.out.println("Character2 Constructor");
        level=lvl;
        name = n;
    }
    public String getName(){
        return name;
    }
    public int getLevel(){
    return level;
    }
}
