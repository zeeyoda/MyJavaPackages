package OfficeHour;

public class Practice_12_03 {
    public static void main(String[] args) {



        for( int stairs = 3; stairs <= 7 ; stairs ++){
            System.out.println("sing a song");
            System.out.println("Drink water");
            System.out.println("clap");
        }
        for(int level = 90; level >= 80 ; level--){
            System.out.println("I am in level " + level);
        }

        //1 to 10 even numbers

        for(int num = 1; num<=10; num++){
            // 3%2 ==0 is false
            if (num % 2 == 0) {
                System.out.println(num);//2
            }
            for(int number = 1; number <= 10; number  += 2){
                System.out.println(number);
            }
        }
    }
}
