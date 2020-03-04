package muhtar49;

public class Circle extends Shape {
    double radius;
    final double PI = 3.14;
    double diameter;
    public Circle(double r){
        radius = r;
        diameter = radius*2;
    }
    public void Area(){
        System.out.println("Area of the circle is "+(2*radius)*PI);
    }
    protected void perimeter(){
        System.out.println("Perimeter of the circle is "+diameter*PI);
    }
}
