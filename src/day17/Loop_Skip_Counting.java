package day17;

public class Loop_Skip_Counting {
    public static void main(String[] args) {

        //skip counting by 3 from 0 till 30
        // 3 6 9 12 15 18 21 24 27 30
        int counter = 0 ;
        while (counter < 30) {
            counter += 3; // counter = counter + 3 ;
            System.out.println(counter + " ");

        }
    }
}
