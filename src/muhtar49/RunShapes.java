package muhtar49;

public class RunShapes {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(12.25, 15.5);
        r1.Area();
        r1.perimeter();

        Rectangle r2 = new Rectangle(10, 20);
        r2.perimeter();
        r2.Area();

        Square sq1 = new Square(15);
        sq1.Area();
        sq1.perimeter();
        sq1.Capacity();

        Circle circle = new Circle(15);
        circle.Area();
        circle.Capacity();
        circle.perimeter();

        Cylinder cyl1 = new Cylinder(15, 20);
        cyl1.Area();
        cyl1.perimeter();
        cyl1.shapes();






    }
}
