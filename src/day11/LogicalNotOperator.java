package day11;

public class LogicalNotOperator {
    public static void main(String[] args) {
        //Logical NOT operator ! exclamation mark used to negate the boolean value
        //Logical NOT operator ! can only be used with boolean ONLY

        System.out.println( true );
        System.out.println( false );
        //first we can use it directly to boolean value like true and false
        System.out.println("The result of  ! true is -->>");
        System.out.println( ! true );// flip the coin make it false
        System.out.println("The result of ! false is -->>");
        System.out.println( ! false );// flip the coin and make it true

        boolean isRecording = false;
        System.out.println("The result of ! isRecording -->> ");
        //second you can use it in front of a boolean variable and it will give opposite value
        System.out.println( ! isRecording);

        // you can use Logical NOT operator ! in front of boolean
        //boolean expression is any expression that result in a boolean value
        //for example 7>5, x>10, y==20, x>y, x>10 && x<100

        System.out.println(" result of  ! (7>5) is ");
        System.out.println( !(7>5));

        int x = 7 ;
        System.out.println(" result of (x>10) is ");
        System.out.println( (x>10));
        System.out.println(" result of !(x>10) is ");
        System.out.println( !(x>10));
    }
}
