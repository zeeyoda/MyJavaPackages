package day42;

public class Bike {

            int speed;
            int gear ;

            //constructor is a block of code
            //that has same name as class name
            //and has no return type
            //if it does not meet the above requirement it will not be a constructor
            //the only time you can call this is: when object is being created
            public Bike(){

                System.out.println("Message from constructor");
                gear = 1;
            }
            public Bike(int newGear){
                this.gear = newGear;
            }
            public Bike(int speed, int newGear){
                this.speed = speed;
                this.gear = newGear;
            }
            public Bike(String str){
                System.out.println("Accept String @!!!");
            }

}
