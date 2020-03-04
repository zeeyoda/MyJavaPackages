package OfficeHour;

public class Practice_12_30_Wrapper {
    public static void main(String[] args) {

        int a = 10;
        Integer A = a;

        float f = 0.5f;
        //Double F = f; //

        Double num1 = (double) .05f;// we are casting to double
        Short num3 = 45;
        Integer num4 = 100;
        double num2 = num4;
        System.out.println(num2);

        Long number1 = 100L;//auto
        Float f1 = 100.0f;
        double d1 = f1;// unboxing

        System.out.println(Byte.MAX_VALUE);//returns max value of byte primitive
        System.out.println(Byte.MIN_VALUE);//return min value of byte primitive

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        String str1 = "123";
        System.out.println(str1+1);//returns 1234
        //we will convert String to Integer
        int num = Integer.parseInt(str1);
        System.out.println(str1+1);// this will print 124--->> 123+1

        String str2 = "true";
        boolean r1 = Boolean.parseBoolean(str2);
        System.out.println(r1);
        System.out.println(r1 == false);// true doesnt equal to false therefore false

        String str3 = "FaLsE";
        boolean r2 = Boolean.parseBoolean(str3);
        System.out.println(r2);
        System.out.println("--------------------------------");
        String str4 = "Parvin";
        boolean r3 = Boolean.parseBoolean(str4);
        System.out.println(r3);
        System.out.println("+++++++++++++++++++++++++++++++++++++");

        //ValueOF
        String s1 = "100.5";
        Double c1 = Double.parseDouble(s1);
        System.out.println(c1+1);

        //if I want to assign assign the value to Double wrapper class
        Double c2 = Double.valueOf(s1);
        System.out.println(c1);
        System.out.println(c2);

        String s2 = "TruE";
        Boolean b1 = Boolean.valueOf(s2);
        System.out.println(b1);

        Double[] arr = new Double[3];// default value is null
        Boolean[] arrb = new Boolean[4];// default value is null
        double[] arrd = new double[5]; //default value is 0






    }
}
