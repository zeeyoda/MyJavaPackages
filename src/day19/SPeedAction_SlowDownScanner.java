package day19;

import java.util.Scanner;

public class SPeedAction_SlowDownScanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter starting speed and ending speed");
        int start = scan.nextInt();
        int end = scan.nextInt();

        System.out.println("You have started at speed: ");
        if (start < end) {
            //i will increase the speed till i reach ending speed

            for (int i = start; i <= end; i++) {
                System.out.print(i + ", ");
            }
            } else if (start > end) {
            for (int x = start; x > end; x--) {
                System.out.print(x + ",");
            }
            }else {
                System.out.print("No Action Needed! Same Speed!");
            }
        }
    }


