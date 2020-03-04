package day34;

public class MethodOverLoadingIntro {
    public static void main(String[] args) {

        System.out.println("Method overloading");
        System.out.println(12);
        String name = "Overloading";
        System.out.println(name.substring(6));
        System.out.println(name.substring(1,4));


        System.out.println(name.indexOf("di"));
        System.out.println(name.indexOf("o",2));
        System.out.println("---------------------------------");

        //Arrays.toString has 9 different versions to accept different parameter
        sayHello();
        sayHello("Universe");
        sayHello("Denis");
        sayHello(100);
        System.out.println(sayHello("Adil","Ablatt"));

    }
    public static void sayHello(){
        System.out.println("Hello, World");
    }
    public static void sayHello(String name){
        System.out.println("Hello, " +name);
    }
    public static void sayHello(int num){
        System.out.println("hello, "+num);
    }
    public static String sayHello(String firstName, String lastName){
        return "Hello, "+ firstName+" "+lastName;
    }
}
