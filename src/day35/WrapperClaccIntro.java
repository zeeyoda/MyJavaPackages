package day35;

public class WrapperClaccIntro {
    public static void main(String[] args) {

        int X = 10;
        // primitive data types are pure values, they have no attributes or behavior

        // each primitive type has a wrapper class that turn it into object so that we can treat it as class
        //below line is the old way, not recommended way of creating Integer Object
        Integer xObj1 = new Integer((12));


        Integer xObj2 = Integer.valueOf(10);
        Integer xObj3 = Integer.valueOf("10");

        byte bValue = xObj2.byteValue();
        System.out.println("bValue = " + bValue);

        double dvalue = xObj2.doubleValue();
        System.out.println("dvalue = " + dvalue);;
    }
}
