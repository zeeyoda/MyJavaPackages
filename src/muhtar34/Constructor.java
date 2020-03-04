package muhtar34;

import java.util.concurrent.Callable;

public class Constructor {


    public Constructor() {
        System.out.println("This is a default constructor");
    }
    public Constructor(int num){
        System.out.println("Hello World");
        System.out.println("I am a constructor with argument of int");
    }
    public void method(){
        Constructor obj1 = new Constructor(8);
    }



    public static void main(String[] args) {
        Constructor obj = new Constructor();
        Constructor obj1 = new Constructor(8);
        obj1.method();

    }

}
