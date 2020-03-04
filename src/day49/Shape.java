package day49;

public abstract class Shape implements Drawable {

    String name;
    double area;

//    public Shape(String str, double ar) {
//        name = str;
//        area = ar;
//    }

    public abstract void calculateArea();
}

