package day41;

public class TVStore {
    public static void main(String[] args) {
        TV t1 = new TV();
       t1.brand = "SamSung";
       t1.currentChannel = 45;

        System.out.println("t1 = " + t1);// same as------> System.out.println("t1.toString() = " + t1.toString());

        t1.turnOn();
        t1.turnOff();
        t1.turnOff();// nothing will happen with second turnOff as it is already off and no else statement in class

        t1.setChannel(12);
        System.out.println("t1 = "+ t1.toString());
    }
}
