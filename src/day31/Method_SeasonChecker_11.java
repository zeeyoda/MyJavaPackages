package day31;

public class Method_SeasonChecker_11 {
    public static void main(String[] args) {
        //a String variable declared and assigned value inside main method
        //it can be accessible in main method
       // String mySeason = "AAAA";

        decideSeasonAction("Winter");
        decideSeasonAction("Summer");
    }

    /**
     * write a static method called decideSeasonAction
     * It has one String parameter called season
     * Inside method method:
     * according to what user passed it should print correct action
     */
    public static void decideSeasonAction(String season) {
        // this season method parameter can only be accessible inside method body
        switch (season) {
            case "Spring":
                System.out.println("Hiking");
                break;
            case "Summer":
                System.out.println("Swimming");
                break;
            case "Fall":
                System.out.println("Pumpkin");
                break;
            case "Winter":
                System.out.println("SnowBall fighting");
            default:
                System.out.println("Invalid season");

        }
    }
}
