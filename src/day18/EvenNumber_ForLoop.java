package day18;

public class EvenNumber_ForLoop {
    public static void main(String[] args) {

        //skip counting by 2
        //starting from 0 till 100

        for ( int x = 0; x<=100; x+=2){
            System.out.println(x + " Even Number");
        }
        //skip count by 3 from 3 till 100
        for ( int x = 0; x<=100; x+=3){
            System.out.println(x + " skipping by 3");
        }
        System.out.println("-------------------------------------");
        for (int i = 0; i < 100 ; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " is an even number");
            }
        }
        for (int i = 0; i < 100; i++) {
            if(i%5 == 0 && i % 3==0){
                System.out.println(i + " FizzBuzz Number");
            }

        }
    }
}
