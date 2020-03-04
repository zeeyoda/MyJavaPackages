package day10;

import java.util.Scanner;

public class SeasonAction_Scanner {

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("What is the season?");
        String season = scan.next();

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
