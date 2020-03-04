package muhtar49;

public class Square extends Shape {
    double side;

    public Square(double s){
        side = s;
    }
    @Override
    protected void Area(){
        double area = side*side;
        System.out.println(area);
    }
    @Override
    public void perimeter(){
        System.out.println("Perimeter of square is "+side*4);

    }


}
