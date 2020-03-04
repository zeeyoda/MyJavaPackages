package OfficeHour;

public class Practice_11_26_19 {
    public static void main(String[] args) {
        String season = "spring";

        switch (season) {
            case "spring":
                System.out.println(("bear is out"));
            case "summer":
                System.out.println("brear is active");
            case "fall":
                System.out.println("bear is active");
            case "winter":
                System.out.println("bear is sleeping");
                break;
            //it can also be consolidated as below
            //case "spring" :
            //case "summer" :
            //case "fall" :
            //System.out.println("bear is active"); as all three have the same statement
        }
    }
}
