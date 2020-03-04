package day22;

public class Boolean_Array_Practice {
    public static void main(String[] args) {

        boolean[] yesNo = new boolean[3];
        System.out.println( yesNo[0]);
        System.out.println( yesNo[1]);
        System.out.println( yesNo[2]);

        yesNo[0] = true;
        yesNo[1] = 10<7;
        yesNo[2] = 10>7;

        System.out.println( yesNo[0]);
        System.out.println( yesNo[1]);
        System.out.println( yesNo[2]);

    }
}
