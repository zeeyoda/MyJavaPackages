package day47;

//I dont need to create car object using this class
//I only want this class to be super class to provide
//reusable fields and methods for subclasses
//this class is designated to be a super class
public abstract class Car {
    int year;
    String brand;


    //abstract class can have abstract method
    //it had abstract keyword
    //it does not have body, DOES NOT HAVE {}
    //it ends with ;
    //It is meant to be overridden to provide body in sub class
    public abstract void start();

    public abstract void goForward();

    public abstract void turn(String str);
    public abstract void goBackward();

}
