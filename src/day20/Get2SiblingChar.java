package day20;

public class Get2SiblingChar {
    public static void main(String[] args) {
        //given a String with value
        //print 2 characters in one line as below example
        //
        //for example :  Ayra
        //Ay
        //yr
        //ra

        String name = "Ayra";
        int lastCharIndex = name.length() - 1;
        System.out.println(name.substring(0, 2));
        System.out.println(name.substring(1, 3));
        System.out.println(name.substring(2, 4));

        for (int x = 0; x <= lastCharIndex - 1; x++) {
            System.out.println(name.substring(x, x + 2));
        }

        String ism = "Ayra";
        int lastCharIndex1 = ism.length() - 1;
        // Ayr 012 --> 03
        //yra  123 --> 14

        System.out.println("Getting 3 characters");
        for (int z = 0; z <= lastCharIndex1 - 2; z++) {
            System.out.println(ism.substring(z, z + 3));

        }
    }
}
