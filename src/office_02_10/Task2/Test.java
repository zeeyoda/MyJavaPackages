package office_02_10.Task2;

public class Test {
    //        create a class called Test:
//        create two objects of circle, one' radious is 3, the other' radius is 5
//        verify if those two circles are equal
    public static void main(String[] args) {
        Circle c1 = new Circle(3);

        Circle c2 = new Circle(5);
        System.out.println(c1==c2);
    }
}
