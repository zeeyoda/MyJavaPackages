package day17;

public class Loop_Even_Number {
    public static void main(String[] args) {

        int counter = 0 ;

        while (counter<=50){
            System.out.print( counter + " ");
            counter += 2 ;
        }
        System.out.println("___________________________");
        int number = 1;
        while (number <= 50 ) {

            System.out.print( number + " ");
            number += 2 ;
        }
        System.out.println("___________________________");
        int cnt3 = 0 ;

        while (cnt3 <= 50) {

        if ( cnt3 %2 ==0) {
            System.out.println(cnt3 + " is an even number");
        }else{
            System.out.println(cnt3 + " is an odd number");
        }
        ++cnt3;
        }


    }

}
