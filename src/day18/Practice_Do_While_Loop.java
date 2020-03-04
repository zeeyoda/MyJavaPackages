package day18;

public class Practice_Do_While_Loop {
    public static void main(String[] args) {

        int x = 0;

        do {
            System.out.println("I am going to skip count by 5: " + x);
            x +=5;
        } while(x<=50);

        System.out.println("----------------------------------------------");
        int y = 9999;
        do {
            System.out.println("Divide by 3: " + y);
            y /= 3;
        }while (y>0);

        System.out.println("----------------------------------------");

        int a = 7;
        do {
            System.out.println(a);
            --a;
        }while(a>0);
        }



    }



