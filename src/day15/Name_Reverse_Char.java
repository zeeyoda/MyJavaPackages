package day15;

public class Name_Reverse_Char {
    public static void main(String[] args) {

        String name = "Otabek";
        char c1 =name.charAt(0);
        char c2 = name.charAt(1);
        char c3 = name.charAt(2);
        char c4 = name.charAt(3);
        char c5 = name.charAt(4);
        char c6 = name.charAt(5);
        System.out.println(c6);
        System.out.println(c5);
        System.out.println(c4);
        System.out.println(c3);
        System.out.println(c2);
        System.out.println(c1);
        System.out.println(name.charAt(0) + " " + name.charAt(1)  + " " + name.charAt(2)
                            + " " + name.charAt(3) + " " + name.charAt(4) + " " + name.charAt(5));

        System.out.println(name.charAt(5) + " " + name.charAt(4)  + " " + name.charAt(3)
                + " " + name.charAt(2) + " " + name.charAt(1) + " " + name.charAt(0));
    }
}
