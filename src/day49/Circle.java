package day49;

public class Circle extends Shape implements Drawable{
    double radius;
    double PI = 3.14;
    @Override
    public void draw(){

    }
    @Override
    public void calculateArea(){
        double area = radius*radius*PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", PI=" + PI +
                ", name='" + name + '\'' +
                ", area=" + area +
                '}';
    }
}
