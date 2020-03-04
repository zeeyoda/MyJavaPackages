package day53;

public abstract class Vegetables {

    String color, taste;

    public Vegetables(String color, String taste){
        this.color = color;
        this.taste = taste;

    }
    public  abstract void cook();

    public abstract void pick();

    public void cut(){

    }
//    public String toString(){
//        return "Hello from Vegetables class.";
//    }


}
