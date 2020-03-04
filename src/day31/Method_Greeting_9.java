package day31;

public class Method_Greeting_9 {
    public static void main(String[] args) {
        //sayHello();
        sayHelloTo("Humans");//-->> print Hello people
        sayHelloTo("Kids"); //-->> print hello Kids
        sayHelloTo("Study Hard");

    }
    //I want to create a method that does below:
    //say hello to person's name I pass hen I call this method
    //(String name) is called a method parameter
    //is it used to tell caller of this method
    //it is expecting this type of data when being called
    public static void sayHelloTo(String name){
        System.out.println("Hello "+name);

    }

//public static void sayHello(){
  //  System.out.println("Hello people");
    }
