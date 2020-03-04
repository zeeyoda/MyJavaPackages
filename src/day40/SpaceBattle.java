package day40;

public class SpaceBattle {
    public static void main(String[] args) {
        Spaceship s1 = new Spaceship();
        s1.name = "Orville";

        s1.setInitialPosition(1, 5);
        s1.setDirection("up");
        s1.mov1Block();

        System.out.println("s1 "+s1);

        s1.setDirection("ABC");
        s1.mov1Block();

        System.out.println("s1 "+s1);
        System.out.println("-----------------------------");

        s1.mov1Block("up");
        s1.mov1Block("right");
        s1.mov1Block("up");
        s1.mov1Block("down");
        s1.mov1Block("HOME");
        System.out.println("s1 = "+s1);


    }
}
