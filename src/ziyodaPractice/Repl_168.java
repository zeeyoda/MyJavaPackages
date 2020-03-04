package ziyodaPractice;

public class Repl_168 {
    public static void main(String[] args) {
        System.out.println(waterTax(50.00));
        System.out.println(waterTax(55.00));
        System.out.println(waterTax(101.00));
        System.out.println(waterTax(151.00));
    }
    public static double waterTax(double units) {
        double bill = 0.0;
        if (units <= 50) {
            bill = units * .60;
        }else if(units>50 && units<=100){
            bill = units*.90;
        }else if(units>100 && units<=150) {
            bill = units * .90 + 50;
        }else if(units>150){
            bill = units*.90 + 100;
        }

        return bill;
    }
}
