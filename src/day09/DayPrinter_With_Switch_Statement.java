package day09;

public class DayPrinter_With_Switch_Statement {

    public static void main(String[] args) {

        int dayCode = 2 ;
        switch (dayCode) { // checks for exact value, dayCode=2
            case 1 :
                System.out.println("Monday");
                break; //used to get out of this branch
            case 2 :
                System.out.println("Tuesday");
                break;
            case 3 :
                System.out.println("Wednesday");
                break;
            case 4 :
                System.out.println("Thursday");
                break;
            case 5 :
                System.out.println("Friday");
                break;
            case 6 :
                System.out.println("Saturday");
                break;
            case 7 :
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Day is unknown");


        }
    }
}
