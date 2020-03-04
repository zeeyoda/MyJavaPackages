package day11;

public class LogicalOperators {

    public static void main(String[] args) {

        //combining multiple operations together
        //in java there is no range check directly like math
        //Ex: 60<x<100 -->> true is <100 this does not work in java like in ordinary algebra
        //in java: x>60 && <100
        // && is called ampersand and single & ampersend  -->> Local AND operator
        //used to check both conditions are true at the same time.
        //think of login example -->> only if user name and password are correct
        //then user can log in

        /* int x=70; x>60 && <100; true
           int x=60; x>60 && <100; false
           int x=110; x>60 && <100; false
           int x=99; x>60 && <100; true

         */
        //Below results are true for Logical AND operator
        System.out.println("Truth table  for logical AND &&");
        System.out.println("Result of true && true is:" + (true && true));
        System.out.println("Result of false && true is:" + (false && true));
        System.out.println("Result of true && false is:" + (true && false));
        System.out.println("Result of false && false is:" + (false && false));

        System.out.println("Truth table for logical OR ||");
        System.out.println("Result of true && true is:" + (true || true));
        System.out.println("Result of false && true is:" + (false || true));
        System.out.println("Result of true && false is:" + (true || false));
        System.out.println("Result of false && false is:" + (false || false));
    }
}
