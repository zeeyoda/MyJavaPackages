package day13;

public class MoreStringPractice {
    public static void main(String[] args) {
        String name = "Pumpkin";
        System.out.println(name);

        //name = "Joni";
        //System.out.println(name);

        name.toUpperCase();
        System.out.println(name);

        System.out.println(name.toUpperCase());
        //What is I really want to change the name
        name = name.toUpperCase();
        System.out.println(name);
    }
}
