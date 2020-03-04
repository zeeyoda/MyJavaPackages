package day12;

import java.util.Scanner;

public class SeasonStringScanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your season, please!!");
        String season = scan.next();
        if (season.equalsIgnoreCase("spring")) {
            System.out.println("Hiking, Navruz, Gardening");
        } else if (season.equalsIgnoreCase("SuMmer")) {
            System.out.println("Swimming, picnic, visit home country");
        }else if ( season.equalsIgnoreCase("fAlL")) {
            System.out.println("Pumpkin pie, Thanksgiving, Halloween");
        }else if(season.equalsIgnoreCase(" winteR")) {
            System.out.println("Skiing, snowball fighting, staying inside, fireplace");
        }else{
            System.out.println("Not Valid");
        }
    }
}
