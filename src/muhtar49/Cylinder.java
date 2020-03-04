package muhtar49;

public class Cylinder extends Shape {
    double radius;
    double height;
    double PI = 3.14;
    double diameter;



    public Cylinder(double r, double h){
        radius = r;
        height = h;
        diameter = radius*2;
     }
     @Override
     protected void Area(){
        double cylinderArea = (2*PI*radius*radius)+(height*2*PI*radius);
         System.out.println(cylinderArea);
     }
     @Override
    protected  void perimeter(){
        double perimeter = 2*(PI*diameter+height);
         System.out.println("Perimeter of cylinder is "+perimeter);
     }
}
