package day23;

public class Ziyoda_Practice_PrintingArray {
    public static void main(String[] args) {
        int[] scores = {56, 65, 23, 54};
        int sum = 0;
        for( int x=0; x<scores.length; x++) {
            System.out.println(scores[x] + " ");
            sum += scores[x];
        }
        System.out.println("The sum of all the numbers is: "+sum);
        /*int len = scores.length;
        System.out.println(len);

        for (int index = 0; index < scores.length; index++) {
            System.out.print(scores[index] + " ");
            System.out.println("=====================================================");
            }*/
        for (int i = scores.length - 1; i >= 0; i--) {
            System.out.print(scores[i] + " ");
        }
    }
}
