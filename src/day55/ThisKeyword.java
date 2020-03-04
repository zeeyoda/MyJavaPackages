package day55;

public class ThisKeyword {

    public ThisKeyword(){
        this(100);
        System.out.println("This is a no arg constructor");


    }
    public ThisKeyword(int x){
       // this();
        System.out.println("One arg constructor "+x);
    }

    public static void main(String[] args) {
        ThisKeyword t1 = new ThisKeyword();



    }
}
