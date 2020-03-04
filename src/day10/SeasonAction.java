package day10;

public class SeasonAction {

    public static void main(String[] args) {

        String season = "venus";

        switch (season){

            case "Spring" :
                System.out.println("Hike, Easter, Navro'z, Blossom");
                break;
            case "Summer" :
                System.out.println("Ocean, Swimming, Picnic, BBQ, Paddleboard");
                break;
            case "Fall"  :
                System.out.println("Rake the leaves, Harvest, Apple Picking");
                break;
            case "Winter" :
                System.out.println("Skiing, Snowboarding");
                break;
            default :
                System.out.println("We do no not have that season on planet Earth");
                break;
        }

    }
}


