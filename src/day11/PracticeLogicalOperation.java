package day11;

public class PracticeLogicalOperation {
    public static void main(String[] args) {
        // create a variable called num with type int
        //find out whether this number is more than 100 or less than 10
        int x = 55 ; //52, 55
        System.out.println(x>100 || x<10);
        System.out.println(x>100 && x<10);

        //more than 2 conditions at the same time, 3 conditions
                                    //true || false --->> true
        System.out.println(true || false || false);
                                    //true && false --->> false
        System.out.println(true || true || false);
                            //false||false||true -->> true
        System.out.println(x==50 || x==51 || x==55);
        //check if x more than 50 and x is not 52 or x equal to 57
                            //true||true||false -->> true
        System.out.println(x>50 && x!=52 || x==57);

        System.out.println(false || true && true);


    }
}
