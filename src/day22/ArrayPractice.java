package day22;

public class ArrayPractice {
    public static void main(String[] args) {

        double[] prices = new double[5];
        System.out.println(prices [0]);

        //array variable cannot be printed out directly to see what's inside
        System.out.println( prices);

        prices [0] = 2.46;
        prices [1] = 19.36;
        prices [2] = 23.56;
        prices [3] = 500;
        prices [4] = 65.123;
        System.out.println(prices[0]);
        System.out.println(prices[1]);
        System.out.println(prices[2]);
        System.out.println(prices[3]);
        System.out.println(prices[4]);
    }
}
