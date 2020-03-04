package muhtar49;

public class Rectangle extends Shape {
    double length, width;


    public Rectangle(double l, double w) {
        length = l;
        width = w;
    }
    @Override
    protected void Area() {
        System.out.println("Area of rectangles is " + (length * width));
    }
    @Override
    public void perimeter() {
        System.out.println("Perimeter of this rectangle is " + (length + width) * 2);

    }
}

