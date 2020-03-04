package day18;

public class Practice_For_Loop {
    public static void main(String[] args) {

        for (int x = 0; x < 6; x += 2) {
            System.out.println("Mama " + x);
        }
        System.out.println("----------------------");

        for (int i = 1; i <= 5; i++) {
            System.out.println("Happy Birthday, Saida!");
        }

        for (int k = 6; k < 100; k += 3) {
            System.out.println("k = " + k);
        }
        for ( int g = 0; g <= 30; g++){
            if( g%5==0 && g%3==0){
                System.out.println(g + " FIZZ BUZZ number");
            }
        }
    }

}
