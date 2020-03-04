package day50;

//abstract class is not required to implement
//inherited abstract method of the interface
public abstract class Shape implements Drawable {

    String name;
    double area;


    //why abstract class must have a constructor even though we cannot create an object from this class?
    //it exists purely to et sub class to call  and reuse the functionality in sub class constructor
    public Shape(String name){
        this.name = name;
    }
    public abstract void calculateArea();

}
