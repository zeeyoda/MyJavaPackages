package office_02_10.Task2;
//create a class called circle:
//        instance variables: radious
//        override equals() method:
//        returns true if the one circule' radius is same with another circle
//        create a class called Test:
//        create two objects of circle, one' radious is 3, the other' radius is 5
//        verify if those two circles are equal

import day09.CitizenTypeChecker;

public class Circle {
    int radius;

    public Circle(int r){
        radius = r;
    }
    @Override
    public boolean equals(Object otherCircle){
        Circle otherRadius = (Circle) otherCircle;
        return otherRadius.radius==((Circle) otherCircle).radius;
    }

}
