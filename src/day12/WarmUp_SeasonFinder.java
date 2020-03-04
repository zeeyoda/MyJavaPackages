package day12;

public class WarmUp_SeasonFinder {
    public static void main(String[] args) {
        int month = 1;
        if ( month>12 || month<0 ) {
            System.out.println(("Invalid Month"));
        }else if ( month>=3 && month<=5) {
            System.out.println("It is Spring");
        }else if ( month>=6 && month<=8) {
            System.out.println("It is Summer");
        }else if ( month>=9 && month<=11) {
            System.out.println("It is Autumn");
        }else if ( month==12 || month==1 || month==2){
            System.out.println("It is winter");
            // since first condition is taking out the invalid situation
            //we do not need else code in this condition
            //else is general condition



        }
    }
}
