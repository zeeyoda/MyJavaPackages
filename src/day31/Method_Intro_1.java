package day31;
// why do we need a method
// -reusable code
// - avoid code duplicate
public class Method_Intro_1 {
    //method can be anywhere inside the class outside main method
    public static void main(String[] args) {
     //two ways to call static methods
     //className.methodName(external data is needed)
     //if you are in same class
     // you can directly call them
     //methodName(external data if needed)
     Method_Intro_1.sayHello();//Optional if you are in the same class
        System.out.println("Begin");
    sayHello();
        System.out.println("___________________");
     sayHello();
        System.out.println("The end!");

    }//main method ends here
    //do not create a method inside a main method
    public static void sayHello(){
        System.out.println("Hello World");
        System.out.println("My name is Ziyoda");
        System.out.println("I like Java");

    }

}
