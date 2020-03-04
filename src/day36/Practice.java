package day36;

public class Practice {
    public static void main(String[] args) {

         char myChar = '9';

        int num = Integer.parseInt(myChar+""); //-->> int 9

        // "123" -->> 123L
        long numL = Long.parseLong("123"); //123L

        //wrap up primitive value to create Object

        // Object oName = new Object();

        String str = new String("Happy New Year");
        int[] nums = new int[8];
        // deprecated means - old way
        Integer i1 = new Integer(1230000000);
        Integer i2 = Integer.valueOf(123);

        // is i3 primitive type variable
        // is i3 reference type variable
        // Auto-Boxing: primitive to wrapper type conversion
        Integer i3 = 45; //----> 45 ----> new Integer(45)

        int i4 = 54;

        //auto unboxing :  wrapper type to primitive type conversion

        int i5 = new Integer(100); // new Integer(100) -->>100

        // auto boxing and auto unboxing is unique feature of conversion between primitive value and wrapper class objects

        Character.isDigit('A');
        System.out.println(Character.isDigit('A'));
    }
}
