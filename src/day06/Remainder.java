package day06;

public class Remainder {
    public static void main(String[] args) {
        // + - * /
        System.out.println(5/2);
        System.out.println(5.0/2);
        System.out.println(5.0/2f);

        System.out.println("-----Modulus . remainder --- ");
        //5 divided by 2 is 2 and remainder is 1
        // 2*2+1=5
        // % this is another operator along with others
        // it's called modulus or remainder operator
        // it will give you remaining result

        System.out.println(5 % 2);
        // 10*9+9=99
        System.out.println(99 % 10);
        //10*10+0=100
        System.out.println(100 % 10);

        //Declare a variable called minutes data type int
        //print the result in x hour y , minutes format
        //for example 135 minutes , 2 hours 15 minutes

        int minutes = 135; //60*2+15

        int hourPart = 135/60;  //-->> 2
        int minsPart = 135%60 ; //-->>15

        System.out.print("The minutes " +minutes + " is " + "hours and " + minsPart + " minutes");



    }
}
