package day19;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Practice_Action {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your starting speed?");
        int startSpeed = scan.nextInt();
        System.out.println("What is your ending speed?");
        int endSpeed = scan.nextInt();
        System.out.println("You started at: "+ startSpeed);
        if(startSpeed<endSpeed) {
            for (int x = startSpeed; x <= endSpeed; x++) {
                System.out.println("YOUR SPEED ENDED AT: " + x);
            }
        }else if(startSpeed>endSpeed){
            for (int x = startSpeed; x >= endSpeed; x--){
                System.out.println("YOUR SPEED ENDED AT: " + x);
            }
        }
    }
}
