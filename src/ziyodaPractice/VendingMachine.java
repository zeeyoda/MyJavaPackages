package ziyodaPractice;
import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    int vehicleYear;

    System.out.println("Please enter vehicle's year ");
    vehicleYear = scan.nextInt();
    if      ((vehicleYear>=1995||vehicleYear<=1998) &&
            (vehicleYear>=2001||vehicleYear<=2002)&&
            (vehicleYear>=2004||vehicleYear<=2006)&&
            (vehicleYear>2014&&vehicleYear<2018)){

       System.out.println("Your vehicle needs to be recalled!");
    }else {
        System.out.println("Your vehicle is fine, enjoy!");
    }
}
}