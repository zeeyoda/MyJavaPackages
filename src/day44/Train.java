package day44;

public class Train  extends Vehicle {
//    String make;
//    int year;
    int wagonCount;
    public void makeChoChoSound(){
        System.out.println("Chooo Chooo");
    }

    public static void main(String[] args) {
        Train t1 = new Train();
        t1.makeChoChoSound();
        t1.make = "Thomas";
        t1.year = 1999;
        //calling the method we got from Vehicle
        t1.start();
        t1.goForward();
    }
//
//    public void start(){
//        System.out.println("starting "+make);
//    }
//    public  void goForward(){
//        System.out.println(make+" is going forward.");
//    }
//
//}

}
