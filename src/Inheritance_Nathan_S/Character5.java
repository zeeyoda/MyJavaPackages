package Inheritance_Nathan_S;

public class Character5 {
    private int level;
    private String name;

    public Character5(String n, int lvl) {
        name = n;
        level = lvl;
    }
        public String getName() {
            return name;
        }
        public int getLevel(){
        return level;
    }
    public void outputStuff(){
        System.out.println("This is from the Superclass");
    }

    @Override
    public String toString() {
        String out = "Name :: "+name+"\nLevel :: "+level;
        return out;
    }
}
