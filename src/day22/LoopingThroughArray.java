package day22;

public class LoopingThroughArray {
    public static void main(String[] args) {
        int[] scores = new int[4] ;
        scores[0] = 95;
        scores[1] = 70;
        scores[2] = 88;
        scores[3] = 100;
        // accessing the elements inside array one by one
        System.out.println(   scores[0]   );
        System.out.println(   scores[1]   );
        System.out.println(   scores[2]   );
        System.out.println(   scores[3]   );
        // how do we get the size of any array object
        //array object has a property called length

        int itemCount = scores.length;
        //for (int x = 0; x <=itemsCount-1; x++) {
        //for (int x = 0; x <lastItemIndex; x++) {
        for (int x = 0; x <itemCount ; x++) {
            System.out.println(scores[x]);
        }
        for (int x = itemCount-1; x>=0 ; x--) {
            System.out.println(scores[x]);

        }

        //how do we get the char count of a String
        String name = "Jon Snow";
        int charCount = name.length();


    }
}
