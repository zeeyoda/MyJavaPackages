package day37;

public class String_Swap_Practice {
    public static void main(String[] args) {
        String a = "Hello";
        String b = "World";
        a = a + b;
        b = a.substring(0, a.indexOf(b));
        a = a.substring(b.length());
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
