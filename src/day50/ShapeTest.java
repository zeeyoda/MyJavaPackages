package day50;

public class ShapeTest {
    public static void main(String[] args) {
        Square s1 = new Square("Pink", 10) ;
        System.out.println("s1 without area calculation = " + s1);
        s1.calculateArea();
        System.out.println("s1 with area calculation = "+s1);
        s1.draw();



    }
}
