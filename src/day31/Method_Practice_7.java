package day31;

public class Method_Practice_7 {
    public static void main(String[] args) {
        wakeUp();
        drinkCoffee();
        DailyRoutine();
        BoysGettingReady();
        studyJava();
        sayILoveJava300Times();

    }
    public static void wakeUp() {

        System.out.println("Open your eye, only one");
        System.out.println("Close your eye");
        System.out.println("Hear your alarm? open it again!");
        System.out.println("-----------------");
    }

    public static void drinkCoffee() {

        System.out.println("Put coffee in your coffee machine ");
        System.out.println("Press the button Make your coffee ");
        System.out.println("-----------------");
    }

        public static void DailyRoutine(){

        System.out.println("I wake up at 6:00am");
        System.out.println("Wake the girls and husband up.");
        System.out.println("Come down start the coffee machine and toast bread for the girls.");
        System.out.println("Feed everyone breakfast and see them off to school and work");
    }
    public static void BoysGettingReady(){
        System.out.println("Wake them up at 7:10");
        System.out.println("Prepare breakfast.");
        System.out.println("Boys eat and drink milk");
        System.out.println("Brush teeth and get dressed");
        System.out.println("Go to bus stop and get on the bus. Off to school.");

    }
    public static void studyJava() {

        System.out.println("Think about java waking up ");
        System.out.println("Think about java drinking Coffee ");
        System.out.println("Think about java preparing Kids ForSchool ");
        System.out.println("Think about java taking Them To School ");
        System.out.println("Eventually sit down and study java , practice practice!!!");
        System.out.println("Review Last classes , come ready for the class");
        System.out.println("-----------------");

    }
    public static void sayILoveJava300Times(){
        for (int i = 0; i <=300 ; i++) {
            System.out.println("I love Java");

        }
        System.out.println();
    }
}
