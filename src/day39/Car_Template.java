package day39;

public class Car_Template {
    String make;
    int year;
    String model;
    String color;


    // instance method are tied to the object
    //it does not have static keyword
    //we need an object when we call them

    public void goForward(){
        System.out.println(make+" Going Forward");
    }

    //create a method to print the age of this car
    public void getAge(){
        System.out.println("car age : "+(2020-year));
    }
    public void changeColorTo(String newColor){
        //bunch of code here to validate user is actually
        //passing correct color
        //example: red and blue valid colors, anything is not
        color=newColor;


    }

}
